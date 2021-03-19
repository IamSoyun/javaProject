package com.yedam.diary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DiaryListDAO implements DAO{

	String fileName = "diary.dat";
	String filePath;
	List<DiaryVO> list;
	
	public DiaryListDAO() {
		filePath = System.getProperty("user.home") + "/" + fileName;
		readFile();
	}
	
	public void readFile() {
		
		File file = new File(filePath);
		if(!file.exists()) {
			list = new ArrayList<DiaryVO>();
		}else {
			
			try {
				FileInputStream fis = new FileInputStream(filePath);
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis);
				
				list = (List<DiaryVO>) ois.readObject();
				System.out.println((list!=null ? list.size() : 0) + "건 read됨.");
				ois.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
			
					
		}
		
	}
	
	public void writeFile() { //파일저장
		
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			oos.writeObject(list);
			oos.close();
			System.out.println("저장됨.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	@Override
	public int insert(DiaryVO vo) {
		
		int ii = 100000;
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).getWdate().equals(vo.getWdate())) {
				return 0;
			}
			if(list.get(i).getWdate().compareTo(vo.getWdate()) < 0) {
				ii = i;
				break;
			}
		}
		if(ii != 100000)
			list.add(ii, vo);
		else
			list.add(vo);
		
		writeFile();
		
		return 1;
	}

	@Override
	public void update(DiaryVO vo) {
		
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).getWdate().equals(vo.getWdate())) {
				list.set(i, vo);
				writeFile();
				System.out.println("수정완료.");
			}
		}
		
	}

	@Override
	public int delete(String date) {
		
		int ii = 0;
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).getWdate().equals(date)) {
				list.remove(i);
				writeFile();
				return 1;
			}
		}
		return 0;
	}

	@Override
	public DiaryVO selectDate(String date) {
		
		for(DiaryVO diary : list) {
			if(diary.getWdate().equals(date)) {
				return diary;
			}
		}
		return null;
	}

	@Override
	public List<DiaryVO> selectContent(String content) {
		
		List<DiaryVO> dairy = new ArrayList<>();
		for(DiaryVO vo : list) {
			if(vo.getContents().contains(content))
				dairy.add(vo);
		}
		
		return dairy;
	}

	@Override
	public List<DiaryVO> selectAll() {
		return list;
	}

}
