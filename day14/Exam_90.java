package com.day14;

public class Exam_90 {
	//[1]
	private int user1, com1;
	private String result1;
	
	public int getUser1() {
		return user1;
	}
	public void setUser1(int user1) {
		if(user1 >=3 || user1 < 0) {
			System.out.println("잘못입력");
			return;
		}
		this.user1 = user1;
	}
	public int getCom1() {
		return com1;
	}
	public void setCom1(int com1) {
		this.com1 = com1;
	}
	
	public String getResult1() {
		return result1;
	}
	public void setResult1(String result1) {
		this.result1 = result1;
	}
	
	public void game1() {
		int a = (user1 - com1 + 3) % 3;
		switch(a) {
			case 0: result1 = "비김"; break;
			case 1: result1 = "이김"; break;
			default: result1 = "짐"; 
		}
	}
	
	public String change(int a) {
		String str = "";
		switch(a) {
			case 0: str = "가위"; break;
			case 1: str = "바위"; break;
			default: str = "보";
		}
		return str;
	}

	//[2]
	private String user, com;
	private String result;
	
	public String getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = tranceInt(user);
	}
	
	public String getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = tranceInt(com);
	}
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	public void game(int user, int com) {
		if((user - com + 3) % 3 == 1) {
			result = "이김";
		}else if((user - com + 3) % 3 == 2) {
			result = "짐";
		}else {
			result = "비김";
		}
	}
	
	private String tranceInt(int i) {
		
		String trance = "";
		if(i == 0) {
			trance = "가위";
		}else if(i == 1) {
			trance = "바위";
		}else {
			trance = "보";
		}
		return trance;
		
	}

}
