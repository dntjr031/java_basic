package com.day21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExam {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			System.out.println("�� ���� �Է��ϼ���");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.println(n1 + "�� " + n2 + "�� ���� ������ : " + n1%n2);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("���� : " + e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
