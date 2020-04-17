package com.day17;

import java.util.Scanner;

public class SuperTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 학번, 전공을 입력하세요");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String sNo = sc.nextLine();
		String major = sc.nextLine();
		
		Graduate st = new Graduate(name, age, sNo, major);
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
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
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
		System.out.println("학번 : " + getSNo());
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
		System.out.println("전공 : " + major);
		System.out.println("논문을 씁니다!");
	}
	
	
}
