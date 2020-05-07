package com.day16;

import java.util.Scanner;

public class HumanTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Teacher t = new Teacher();
		Programmer p = new Programmer();
		System.out.println("이름, 나이, 과목 입력");
		t.setName(sc.nextLine());
		t.setAge(sc.nextInt());
		sc.nextLine();
		t.setSubject(sc.nextLine());
		System.out.println("이름: " + t.getName());
		System.out.println("나이: " + t.getAge());
		System.out.println("과목: " + t.getSubject());
		t.work();
		
		System.out.println("===================");
		
		System.out.println("이름, 나이, 개발경력을 입력");
		p.setName(sc.nextLine());
		p.setAge(sc.nextInt());
		sc.nextLine();
		p.setCareer(sc.nextLine());
		System.out.println("이름: " + p.getName());
		System.out.println("나이: " + p.getAge());
		System.out.println("개발경력: " + p.getCareer());
		p.work();
		
		sc.close();

	}

}
