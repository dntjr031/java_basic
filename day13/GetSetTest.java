package com.day13;

import java.util.Scanner;

class Info{
	
	private String name, gender;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	

}

public class GetSetTest {
	
	public static void main(String[] args) {
		Info in = new Info();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		in.setName(sc.nextLine());
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		sc.nextLine();
		String gender = sc.nextLine();
		
		
		
		in.setAge(age);
		in.setGender(gender);
		
		System.out.println(in.getName());
		
		sc.close();

	}

}
