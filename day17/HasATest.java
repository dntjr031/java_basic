package com.day17;

public class HasATest {
	
	public static Point2 createPoint(int type) {
		Point2 p = null;
		if(type == 1) {
			p = new Point2(10,20);
		}
		return p;
	}

	public static void main(String[] args) {
		Point2 p = new Point2(7,8);
		Circle2 c = new Circle2(p, 11);
		c.printInfo();

		Point2 p2 = createPoint(1);
		System.out.println("p2.x=" + p2.x);
		System.out.println("p2.y=" + p2.y + "\n");
		Circle2 c2 = new Circle2(p2, 5);
		c2.printInfo();
	}

}

class Point2{
	int x, y;

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle2{
	Point2 p; //포함관계 이용
	int r;
	
	public Circle2(Point2 p, int r) {
		this.p = p;
		this.r = r;
	}
	
	public void printInfo() {
		System.out.println("x=" + p.x);
		System.out.println("y=" + p.y);
		System.out.println("r=" + r + "\n");
	}
}