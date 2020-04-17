package com.day17;

public class IsATest {

	public static void main(String[] args) {
		Circle c = new Circle(3, 4, 10);
		c.printInfo();

	}

}
/*
 ��Ŭ������ ���� �ϴ� ���
 [1] ��Ӱ��� �̿�
 is a ���谡 �����ϸ� ����� �̿�
 ~�� ������ ~�̴�.
 
 ��) SportsCar �� ������ Car�̴�
 	SportsCar is a Car.
 	
 [2] ���԰��� �̿�
 has a ���谡 �����ϸ� ���԰��� �̿�
 ~�� ~�� ������ �ִ�
 
  ��) Circle�� Point�� �������ִ�
  	Circle has a Point.
 */
//��Ӱ��� �̿�
class Point{
	protected int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle extends Point{
	private int r;

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	
	public void printInfo() {
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("r=" + r + "\n");
	}
}
