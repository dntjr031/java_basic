package com.day13;

public class NameCard {
	String name, add, rank, celNum;

	public NameCard(String name, String add, String rank, String celNum) {
		
		this.name = name;
		this.add = add;
		this.rank = rank;
		this.celNum = celNum;
		
	}
	
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + add);
		System.out.println("직급 : " + rank);
		System.out.println("전화번호 : " + celNum);
		
	}

}
