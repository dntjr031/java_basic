package com.day17;

public class IsATest {

	public static void main(String[] args) {
		Circle c = new Circle(3, 4, 10);
		c.printInfo();

	}

}
/*
 ※클래스를 재사용 하는 방법
 [1] 상속관계 이용
 is a 관계가 성립하면 상속을 이용
 ~는 일종의 ~이다.
 
 예) SportsCar 는 일종의 Car이다
 	SportsCar is a Car.
 	
 [2] 포함관계 이용
 has a 관계가 성립하면 포함관계 이용
 ~는 ~을 가지고 있다
 
  예) Circle은 Point를 가지고있다
  	Circle has a Point.
 */
//상속관계 이용
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
