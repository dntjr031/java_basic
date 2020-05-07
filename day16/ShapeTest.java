package com.day16;

import java.util.Scanner;

class Shape2{
	public double findArea() {
		return 0;
	}
}

class Circle extends Shape2{
	private double r;
	
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double findArea() {
		return r * r * 3.14;
	}
	
}

class Rectangle extends Shape2{
	private double w, d;

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public double findArea() {
		return w * d;
	}
	
}

public class ShapeTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Circle c = new Circle();
		Rectangle re = new Rectangle();
		System.out.println("반지름과 가로, 세로를 입력하세요");
		c.setR(sc.nextDouble());
		re.setD(sc.nextDouble());
		re.setW(sc.nextDouble());
		
		double d = c.findArea();
		double d2 = re.findArea();
		
		System.out.println("원의 면적 : " + d);
		System.out.println("사각형의 면적 : " + d2);
		
		sc.close();

	}

}
