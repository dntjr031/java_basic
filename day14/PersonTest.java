package com.day14;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 전화번호 입력!");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String tel = sc.nextLine();
		
		Person p = new Person(name, tel, age);
		p.showInfo();
		
		// getter/ setter 연습
		
		p.setName("홍길동");
		p.setAge(25);
		p.setPhone("010-100-3000");
		
		System.out.println("\n변경된 이름 : " + p.getName());
		System.out.println("나이 : " + p.getAge());
		System.out.println("전화번호 : " + p.getPhone());
		

		sc.close();
	}

}
