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
		System.out.println("���� �ѷ� = "+ 2 * r * RATE);
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
		System.out.println("�簢���� �ѷ� = "+ (w + d)*2);
	}

	public String toString() {
		return "Rectangle [w=" + w + ", d=" + d + ", Girth=" + (w + d)*2 + "]";
	}
	
}

public class ShapeExam {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("1�ܰ�-----------------");
		
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
