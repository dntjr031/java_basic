package com.day18;

import java.util.Scanner;


class Shape2{
	public void findArea() {
		System.out.println("������ ������ ���Ѵ�.");
	}
}

class Circle2 extends Shape2{
	private double r;
	private final double PI = 3.141592;
	
	public Circle2(double r) {
		this.r = r;
	}

	public void findArea() {
		System.out.println("���� ���� : " + r * r * PI);
	}
	
}

class Rectangle extends Shape2{
	private int w, d;

	public Rectangle(int w, int d) {
		this.w = w;
		this.d = d;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public double getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public void findArea() {
		System.out.println("�簢���� ���� : " + w * d); 
	}
	
}

public class ShapeTest {
	static final int MAX_COUNT = 10;
	static Shape2[] sh = new Shape2[MAX_COUNT];
	static int i = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.print("1.��, 2.�簢��, 3.����, 4.���� ==> ");
	}
	
	public static void inputCircle() {
		if(i == MAX_COUNT) {
			System.out.println("���̻� �Է��� �� �����ϴ�.");
			return;
		}
		System.out.print("������ : ");
		int r = sc.nextInt();
		sh[i] = new Circle2(r);
		i++;
	}
	
	public static void inputRectangle() {
		if(i == MAX_COUNT) {
			System.out.println("���̻� �Է��� �� �����ϴ�.");
			return;
		}
		System.out.println("����, ���� �Է�");
		int w = sc.nextInt();
		int h = sc.nextInt();
		sh[i] = new Rectangle(w, h);
		i++;
	}
	
	public static void printAll() {
		if(i == 0) {
			System.out.println("�����Ͱ� �����ϴ�.");
			return;
		}
		for (int j = 0; j < i; j++) {
			sh[j].findArea();
		}
	}
	
	public static void main(String[] args) {
		
		
		while(true) {
			if(i >= MAX_COUNT) {
				System.out.println("\n���̻� �����͸� �Է��� �� �����ϴ�.");
				System.out.println("<������ ���⸸ ����>");
			}
			showMenu();
			int n = sc.nextInt();
			
			if(n == 1) {
				inputCircle();
				continue;
			}else if(n == 2) {
				inputRectangle();
				continue;
			}else if(n == 3) {
				printAll();
				continue;
			}else if(n == 4) {
				System.out.println("�����մϴ�");
				break;
			}else {
				System.out.println("�߸��Է�!");
				continue;
			}
			
		}
		
	}

}
