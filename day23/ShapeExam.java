package com.day23;

import java.util.Scanner;

abstract class Shape{
	abstract public void findGirth();
}

class Circle extends Shape{
	private double r;
	private static final double RATE = 3.14;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public void findGirth() {
		System.out.println("원의 둘레 = "+ 2 * r * RATE);
	}
	
	public String toString() {
		return "Circle [r=" + r + ", Girth=" + 2 * r * RATE + "]";
	}
	
}

class Rect extends Shape{
	private double w, d;

	public Rect(double w, double d) {
		this.w = w;
		this.d = d;
	}

	public void findGirth() {
		System.out.println("사각형의 둘레 = "+ (w + d)*2);
	}

	public String toString() {
		return "Rectangle [w=" + w + ", d=" + d + ", Girth=" + (w + d)*2 + "]";
	}
	
}

public class ShapeExam {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("1단계-----------------");
		
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
