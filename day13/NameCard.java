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
		System.out.println("�̸� : " + name);
		System.out.println("�ּ� : " + add);
		System.out.println("���� : " + rank);
		System.out.println("��ȭ��ȣ : " + celNum);
		
	}

}
