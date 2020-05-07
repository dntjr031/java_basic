package com.day23;

import java.util.Scanner;

public class ShapeExam2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("2단계-----------------");
		while(true) {
			Shape s = null;
			System.out.println("1. 원, 2. 사각형, 3. 종료 중 선택");
			int n = sc.nextInt();
			switch(n) {
				case 1:
					System.out.println("반지름을 입력하세요");
					double d = sc.nextDouble();
					s = new Circle(d);
					break;
				case 2:
					System.out.println("가로, 세로를 입력하세요");
					double w = sc.nextDouble();
					double d1 = sc.nextDouble();
					s = new Rect(w, d1);
					break;
				case 3:
					System.out.println("종료");
					return;
				default:
					System.out.println("종료");
					return;
			}
			s.toString();
			s.findGirth();
		
		}
	}

}
