package com.day16;

public class Person2 {
	protected String name;
	protected int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class Student2 extends Person2{
	protected int stuNum;

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	
	public void study() {
		System.out.println("�����Ѵ�");
	}
}

class Graduate2 extends Student2{
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public void writeThesis() {
		System.out.println("���� ����");
	}
}