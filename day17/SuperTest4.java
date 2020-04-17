package com.day17;

import java.util.Scanner;

public class SuperTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 학번을 입력하세요");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String sNo = sc.nextLine();
		
		Student st = new Student(name, age, sNo);
		st.showInfo();
		
		//멤버변수 값 변경
		st.setName("김길동");
		st.setAge(20);
		st.setSNo("20110231");
		// getter 이용
		System.out.println("\n이름 : " + st.getName());
		System.out.println("나이 : " + st.getAge());
		System.out.println("학번 : " + st.getSNo());
		
		sc.close();

	}

}

class Person{
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
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
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
	}
	
}

class Student extends Person{
	private String sNo;

	public Student(String name, int age, String sNo) {
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
		System.out.println("학번 : " + getSNo());
	}
	
}
