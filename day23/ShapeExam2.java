package com.day23;

import java.util.Scanner;

public class ShapeExam2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("2�ܰ�-----------------");
		while(true) {
			Shape s = null;
			System.out.println("1. ��, 2. �簢��, 3. ���� �� ����");
			int n = sc.nextInt();
			switch(n) {
				case 1:
					System.out.println("�������� �Է��ϼ���");
					double d = sc.nextDouble();
					s = new Circle(d);
					break;
				case 2:
					System.out.println("����, ���θ� �Է��ϼ���");
					double w = sc.nextDouble();
					double d1 = sc.nextDouble();
					s = new Rect(w, d1);
					break;
				case 3:
					System.out.println("����");
					return;
				default:
					System.out.println("����");
					return;
			}
			s.toString();
			s.findGirth();
		
		}
	}

}
