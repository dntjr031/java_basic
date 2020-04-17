package com.day7;

import java.util.Scanner;

public class ForExam2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 구구단의 단을 입력하세요");
		int dan = sc.nextInt();
		
		System.out.println(dan + "단(역순)");
		for(int i = 9; i > 0; i--) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		sc.close();
	}

}
