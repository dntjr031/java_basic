package com.day14;

import java.util.Scanner;

public class ProgrammerTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ���߾��, ���߰���� �Է��ϼ���");
		String name = sc.nextLine();
		String language = sc.nextLine();
		int career = sc.nextInt();
		
		Programmer pr = new Programmer(name, language, career);
		
		System.out.println("�̸� : " + pr.getName());
		System.out.println("���߾�� : " + pr.getLanguage());
		System.out.println("���߰�� : " + pr.getCareer() + "��");
		pr.work();
		
		System.out.println("\n============�� ����=============\n");
		
		pr.setName("��켮");
		pr.setLanguage("java");
		pr.setCareer(1);
		
		System.out.println("�̸� : " + pr.getName());
		System.out.println("���߾�� : " + pr.getLanguage());
		System.out.println("���߰�� : " + pr.getCareer() + "��");
		pr.work();
		
		sc.close();

	}

}
