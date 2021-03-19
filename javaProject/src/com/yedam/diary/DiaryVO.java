package com.yedam.diary;

import java.io.Serializable;

public class DiaryVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String wdate; 
	private String contents;
	
	public DiaryVO() { }
	
	public DiaryVO(String wdate, String contents) {
		this.wdate = wdate;
		this.contents = contents;
	}
	
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return wdate + "\n" + contents + "\n=================";
	}
	
	
	
}
