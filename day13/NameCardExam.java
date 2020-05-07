package com.day13;

import java.util.Scanner;

public class NameCardExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 회사주소, 직급, 전화번호 입력");
		String name = sc.nextLine();
		String add = sc.nextLine();
		String rank = sc.nextLine();
		String cel = sc.nextLine();
		
		NameCard nce = new NameCard(name, add, rank, cel);
		System.out.println("==========================");
		nce.print();
		
		sc.close();

	}

}
