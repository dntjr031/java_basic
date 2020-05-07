package com.day18;

import java.util.Scanner;


class Shape2{
	public void findArea() {
		System.out.println("도형의 면적을 구한다.");
	}
}

class Circle2 extends Shape2{
	private double r;
	private final double PI = 3.141592;
	
	public Circle2(double r) {
		this.r = r;
	}

	public void findArea() {
		System.out.println("원의 면적 : " + r * r * PI);
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
		System.out.println("사각형의 면적 : " + w * d); 
	}
	
}

public class ShapeTest {
	static final int MAX_COUNT = 10;
	static Shape2[] sh = new Shape2[MAX_COUNT];
	static int i = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.print("1.원, 2.사각형, 3.보기, 4.종료 ==> ");
	}
	
	public static void inputCircle() {
		if(i == MAX_COUNT) {
			System.out.println("더이상 입력할 수 없습니다.");
			return;
		}
		System.out.print("반지름 : ");
		int r = sc.nextInt();
		sh[i] = new Circle2(r);
		i++;
	}
	
	public static void inputRectangle() {
		if(i == MAX_COUNT) {
			System.out.println("더이상 입력할 수 없습니다.");
			return;
		}
		System.out.println("가로, 세로 입력");
		int w = sc.nextInt();
		int h = sc.nextInt();
		sh[i] = new Rectangle(w, h);
		i++;
	}
	
	public static void printAll() {
		if(i == 0) {
			System.out.println("데이터가 없습니다.");
			return;
		}
		for (int j = 0; j < i; j++) {
			sh[j].findArea();
		}
	}
	
	public static void main(String[] args) {
		
		
		while(true) {
			if(i >= MAX_COUNT) {
				System.out.println("\n더이상 데이터를 입력할 수 없습니다.");
				System.out.println("<데이터 보기만 가능>");
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
				System.out.println("종료합니다");
				break;
			}else {
				System.out.println("잘못입력!");
				continue;
			}
			
		}
		
	}

}
