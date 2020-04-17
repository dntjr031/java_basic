package com.day21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExam {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			System.out.println("두 수를 입력하세요");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.println(n1 + "과 " + n2 + "를 나눈 나머지 : " + n1%n2);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("에러 : " + e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
