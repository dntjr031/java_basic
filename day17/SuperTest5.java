package com.day17;

import java.util.Scanner;

public class SuperTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ����, �й�, ������ �Է��ϼ���");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String sNo = sc.nextLine();
		String major = sc.nextLine();
		
		Graduate st = new Graduate(name, age, sNo, major);
		st.showInfo();
		
		//������� �� ����
		st.setName("��浿");
		st.setAge(20);
		st.setSNo("20110231");
		// getter �̿�
		System.out.println("\n�̸� : " + st.getName());
		System.out.println("���� : " + st.getAge());
		System.out.println("�й� : " + st.getSNo());
		
		sc.close();

	}

}

class Person2{
	protected String name;
	protected int age;
	
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
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
	
	public void showInfo() {
		System.out.println("�̸� : " + getName());
		System.out.println("���� : " + getAge());
	}
	
}

class Student2 extends Person2{
	protected String sNo;

	public Student2(String name, int age, String sNo) {
		super(name, age);
		this.sNo = sNo;
	}

	public String getSNo() {
		return sNo;
	}

	public void setSNo(String sNo) {
		this.sNo = sNo;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("�й� : " + getSNo());
	}
	
}

class Graduate extends Student2{
	private String major;

	public Graduate(String name, int age, String sNo, String major) {
		super(name, age, sNo);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("���� : " + major);
		System.out.println("���� ���ϴ�!");
	}
	
	
}
