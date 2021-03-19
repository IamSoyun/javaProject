package academy;

import java.util.Scanner;

public class AcademyMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[100];
		AcaDAO acaDao = new AcaDAO();

		boolean run = true;

		while (run) { // id - admin, pwd - super
			System.out.print("관리자 id > ");
			String id = sc.nextLine();
			System.out.print("비밀번호 > ");
			String pwd = sc.nextLine();

			if (id.equals("admin") && pwd.equals("super")) {
				System.out.println("로그인 되었습니다.");
				acaDao.start();
				run = false;
			} else {
				System.out.println("아이디 혹은 비밀번호 다릅니다.");
			}

		}

		run = true;

		while (run) {

			int ans;

			System.out.println("--------------------------------------------------------------");
			System.out.println("1.학생등록 2.학생정보(연락처)수정 3.성적입력 4.성적조회 5.성적수정 6.리스트 9.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택 > ");
			ans = Integer.parseInt(sc.nextLine());
			
			if(ans == 1) { // 학생 등록
				
				System.out.print("학생번호 > ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.print("학생이름 > ");
				String name = sc.nextLine();
				System.out.print("학생나이 > ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("학생휴대폰번호 > ");
				String phone = sc.nextLine();
				
				acaDao.insertStd(new Student(id, name, age, phone, 0));
				
			} else if(ans == 2) { // 학생 정보(연락처) 수정
				
				System.out.print("수정할 학생 번호 > ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.print("수정할 연락처 입력 > ");
				String phone = sc.nextLine();
				
				acaDao.updateStd(new Student(id,null,0,phone,0));
				
			} else if(ans == 3) { // 성적 일괄 입력
				
				acaDao.insertScore();
				
			} else if(ans == 4) { // 성적 조회
				
				System.out.print("성적 조회할 학생 번호 > ");
				int id = Integer.parseInt(sc.nextLine());
				
				acaDao.showScore(id);
				
			} else if(ans == 5) { // 성적 수정
				
				System.out.print("성적 입력할 학생 번호 > ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.print("점수 입력 > ");
				int score = Integer.parseInt(sc.nextLine());
				acaDao.updateScore(id, score);
				
			} else if(ans == 6) { // 학생 리스트
				
				for(Student std : acaDao.stdList() ) {
					if(std == null) 
						break;
					System.out.printf("%02d/%s/%d/%s/%d\n",std.getStdId(),std.getStdName(),
							std.getStdAge(),std.getStdPhone(),std.getStdScore());
				}
				
				
			} else if(ans == 9 ) { // 종료
				System.out.println("시스템 종료.");
				run = false;
			}
			
			
		}

	}

}
