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
			System.out.println("�߸��Է�");
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
			case 0: result1 = "���"; break;
			case 1: result1 = "�̱�"; break;
			default: result1 = "��"; 
		}
	}
	
	public String change(int a) {
		String str = "";
		switch(a) {
			case 0: str = "����"; break;
			case 1: str = "����"; break;
			default: str = "��";
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
			result = "�̱�";
		}else if((user - com + 3) % 3 == 2) {
			result = "��";
		}else {
			result = "���";
		}
	}
	
	private String tranceInt(int i) {
		
		String trance = "";
		if(i == 0) {
			trance = "����";
		}else if(i == 1) {
			trance = "����";
		}else {
			trance = "��";
		}
		return trance;
		
	}

}
