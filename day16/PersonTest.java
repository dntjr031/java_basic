package com.day16;

import java.util.Scanner;

class Person{
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

class Student extends Person{
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
}

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		System.out.println("�̸�, ����, ������ �Է��ϼ���");
		st.setName(sc.nextLine());
		st.setAge(sc.nextInt());
		sc.nextLine();
		st.setMajor(sc.nextLine());
		
		System.out.println("==================================");
		System.out.println("�̸�:" + st.getName());
		System.out.println("����:" + st.getAge());
		System.out.println("����:" + st.getMajor());
		
		sc.close();

	}

}
