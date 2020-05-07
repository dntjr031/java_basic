package com.day16;

public class Human {
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

class Teacher extends Human{
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void work() {
		System.out.println("가르친다");
	}
}

class Programmer extends Human{
	private String career;

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}
	
	public void work() {
		System.out.println("프로그래밍한다");
	}
}
