package com.yedam.diary;

public class DiaryApp {

	DAO dao;

	public void start() {
		
//		dao = new DiaryListDAO();
		dao = new DiaryOracleDAO();

		int menuNum = 0;

		do {
			menuPrint();
			menuNum = menuChoose();
			process(menuNum);

		} while (menuNum != 0);

		System.out.println("END");
	}

	// 메뉴출력
	public static void menuPrint() {
		Menu[] arr = Menu.values();
		int i = 0;
		for (Menu menu : arr) {
			System.out.print(String.format("%d:%s ", i++, menu.name()));
		}
		System.out.println();
	}

	// 메뉴선택
	public int menuChoose() {

		int num = 0;
		do {
			System.out.print("메뉴선택 > ");
			int MenuSize = Menu.values().length;
			num = StdInputUtil.readInt();
			if (num < MenuSize && num >= 0)
				break;
			System.out.println("범위 밖 숫자 입력.");
		} while (true);

		return num;
	}

	// 메뉴실행
	public void process(int menuNum) {
		
		Menu menu = Menu.getMenu(menuNum);
		
		switch (menu) {
		case 종료: exit(); break;
		case 추가: insert(); break;
		case 수정: update(); break;
		case 삭제: delete(); break;
		case 전체조회: selectAll(); break;
		case 날짜검색: selectDate(); break;
		case 내용검색:selectContent(); break;
		}
		
	}
	
	public void exit() {
		System.out.println("종료선택>>");
	}
	
	public void insert() {
		
		System.out.println("입력선택>>");
		System.out.print("날짜입력[yymmdd] > ");
		String wdate = StdInputUtil.readDate();
		System.out.println("내용: ");
		String contents = StdInputUtil.readMultiLine();
		
		DiaryVO vo = new DiaryVO();
		vo.setWdate(wdate);
		vo.setContents(contents);
		System.out.println(dao.insert(vo) + "건 입력완료.");
		
	}
	
	public void update() {
		System.out.println("수정선택>>");
		System.out.print("날짜입력[yymmdd] > ");
		String wdate = StdInputUtil.readDate();
		System.out.println("수정할 내용: ");
		String contents = StdInputUtil.readMultiLine();
		DiaryVO vo = new DiaryVO(wdate, contents);
		dao.update(vo);
		
		
	}
	
	public void delete() {
		System.out.println("삭제선택>>");
		System.out.print("날짜입력[yymmdd] > ");
		String wdate = StdInputUtil.readDate();
		int cnt = dao.delete(wdate);
		
		if(cnt == 0)
			System.out.println("해당 날짜의 일기가 없습니다.");
		else
			System.out.println(cnt +"건 삭제완료.");
	}
	
	public void selectAll() {
		System.out.println("전체조회선택>>");
		for(DiaryVO vo : dao.selectAll()) {
			System.out.println(vo.toString());
		}
	}
	
	public void selectDate() {
		
		System.out.println("날짜검색>>");
		System.out.print("날짜입력[yymmdd] > ");
		String wdate = StdInputUtil.readDate();
		DiaryVO vo = dao.selectDate(wdate);
		
		if(vo == null) {
			System.out.println("해당 날짜의 일기가 없습니다.");
		}else {
			System.out.println(vo.toString());
		}
	}
	
	public void selectContent() {
		System.out.println("내용검색>>");
		System.out.print("내용입력 > ");
		String content = StdInputUtil.readOneLine();
		int cnt = 0;
		
		for(DiaryVO vo : dao.selectContent(content)) {
			System.out.println(vo.toString());
			cnt++;
		}
		
		System.out.println(cnt +"건 검색완료.");
		
	}
}
