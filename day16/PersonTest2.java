package com.day16;

import java.util.Scanner;

public class PersonTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Graduate2 g = new Graduate2();
		System.out.println("�̸�, ����, �й�, ������ �Է��ϼ���");
		g.setName(sc.nextLine());
		g.setAge(sc.nextInt());
		g.setStuNum(sc.nextInt());
		sc.nextLine();
		g.setMajor(sc.nextLine());
		
		System.out.println("============================");
		System.out.println("�̸�:" + g.getName());
		System.out.println("����:" + g.getAge());
		System.out.println("�й�:" + g.getStuNum());
		System.out.println("����:" + g.getMajor());
		g.writeThesis();
		
		sc.close();
	}

}
