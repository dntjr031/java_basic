package com.day15;

public class Student {
	private String name;
	private int idNo;

	public Student(String name, int idNo) {
		
		this.name = name;
		this.idNo = idNo;
	}
	
	public void info() {
		System.out.println("�̸�:" + name);
		System.out.println("�й�:" + idNo);
		System.out.println("----------------\n");
	}
}
