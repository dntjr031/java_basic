package com.day14;

import java.util.Scanner;

public class ProgrammerTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 개발언어, 개발경력을 입력하세요");
		String name = sc.nextLine();
		String language = sc.nextLine();
		int career = sc.nextInt();
		
		Programmer pr = new Programmer(name, language, career);
		
		System.out.println("이름 : " + pr.getName());
		System.out.println("개발언어 : " + pr.getLanguage());
		System.out.println("개발경력 : " + pr.getCareer() + "년");
		pr.work();
		
		System.out.println("\n============값 변경=============\n");
		
		pr.setName("김우석");
		pr.setLanguage("java");
		pr.setCareer(1);
		
		System.out.println("이름 : " + pr.getName());
		System.out.println("개발언어 : " + pr.getLanguage());
		System.out.println("개발경력 : " + pr.getCareer() + "년");
		pr.work();
		
		sc.close();

	}

}
