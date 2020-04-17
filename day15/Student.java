package com.day15;

public class Student {
	private String name;
	private int idNo;

	public Student(String name, int idNo) {
		
		this.name = name;
		this.idNo = idNo;
	}
	
	public void info() {
		System.out.println("이름:" + name);
		System.out.println("학번:" + idNo);
		System.out.println("----------------\n");
	}
}
