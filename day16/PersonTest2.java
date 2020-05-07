package com.day16;

import java.util.Scanner;

public class PersonTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Graduate2 g = new Graduate2();
		System.out.println("이름, 나이, 학번, 전공을 입력하세요");
		g.setName(sc.nextLine());
		g.setAge(sc.nextInt());
		g.setStuNum(sc.nextInt());
		sc.nextLine();
		g.setMajor(sc.nextLine());
		
		System.out.println("============================");
		System.out.println("이름:" + g.getName());
		System.out.println("나이:" + g.getAge());
		System.out.println("학번:" + g.getStuNum());
		System.out.println("전공:" + g.getMajor());
		g.writeThesis();
		
		sc.close();
	}

}
