package com.day22;

abstract class Shape {
	protected Point p;

	Shape(Point p) {
		this.p = p;
	}
	
	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public abstract double calcArea();  // 도형의 면적을 계산해서 반환하는 메서드

	public void showInfo(){ 
		 // 도형의 원점 x, y를 출력하시오.
		System.out.println("도형의 원점 : " + p.findInfo());
	}
}//class

class Point {
	private int x;
	private int y;

	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String findInfo() {
		return "["+x+","+y+"]";
	}
}

class Rect extends Shape{
	int width, height;

	public Rect(Point p, int width, int height) {
		super(p);
		this.width = width;
		this.height = height;
	}

	public double calcArea() {
		
		return width * height;
	}

	public void showInfo() {
		System.out.println("면적 : " + calcArea());
		super.showInfo();
		System.out.println("폭 : " + width + "높이 : " + height);
	}
	
	public boolean isSquare() {
		boolean bool = false;
		if(width == height) bool = true;
		return bool;
	}
}

class Circle extends Shape{ 
	private double r;

	public Circle(Point p, double r) {
		super(p);
		this.r = r;
	}

	public double calcArea() {
		return r*r*3.14;
	}

	public void showInfo() {
		System.out.println("면적 : " + calcArea());
		super.showInfo();
		System.out.println("반지름 : " + r);
	}
	
}

public class Exercise{

	// sumArea 메서드를 작성하시오
	public static double sumArea(Shape[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].calcArea();
			arr[i].showInfo();
		}
		return sum;
	}

	public static void main(String[] args){
		Shape[] arr = new Shape[3];
		arr[0] = new Circle(new Point(0,0), 5.2);
		arr[1] = new Rect(new Point(10,20), 3, 4);
		arr[2] = new Circle(new Point(30,40), 1);

		System.out.println("면적의 합:"+sumArea(arr));
	}
}
