package com.day22;

public class PhoneInfo {

	private String name, phone;

	public PhoneInfo(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phone);
	}
	
}

class UnivPhone extends PhoneInfo{
	String major, year;
	public UnivPhone(String name, String phone, String major, String year) {
		super(name, phone);
		this.major = major;
		this.year = year;
	}
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("major: " + major);
		System.out.println("year: " + year);
	}
	
	
}

class WorkPhone extends PhoneInfo{
	String work;

	public WorkPhone(String name, String phone, String work) {
		super(name, phone);
		this.work = work;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("work: " + work);
	}
	
	
}


