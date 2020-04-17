package com.day18;

import java.util.Scanner;

public class PolymoTest2 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 기본적인 사용
		Circle c = new Circle();
		c.draw();
		c.delete();
		c.sayCircle();
		c.display();
		
		System.out.println("-----Upcasting-----");
		//다형성 이용
		Shape s = new Circle();
		s.draw(); // 자식의 오버라이딩 메서드 호출
		s.delete();
		s.display(); //부모 메서드
		//s.sayCircle(); => error, 자식만의 메서드 사용 불가
		
		Shape s2 = new Triangle();
		s2.draw();
		s2.delete();
		s2.display();
		
		
		System.out.println("\n\n1. 원, 2. 삼각형 선택");
		int choice = sc.nextInt();
		//기존방식
		if(choice == 1) {
			Circle sh = new Circle();
			sh.draw();
			sh.delete();
		}else if(choice == 2) {
			Triangle sh = new Triangle();
			sh.draw();
			sh.delete();
		}else {
			System.out.println("잘못입력(1, 2 입력)");
			return;
		}
		
		//다형성
		System.out.println("\n다형성 이용");
		Shape sh = Shape.find(choice);
		if(sh != null) {
			sh.draw();
			sh.delete();
		}
	}

}

class Shape{
	protected void draw() {
		System.out.println("모양을 그립니다");
	}
	protected void delete() {
		System.out.println("모양을 지웁니다");
	}
	protected void display() {
		System.out.println("부모 - Shape");
	}
	
	public static Shape find(int choice) {
		Shape sh = null;
		if(choice == 1) {
			sh = new Circle();
		}else if(choice == 2) {
			sh = new Triangle();
		}
		return sh;
	}
}

class Circle extends Shape{

	protected void draw() {
		System.out.println("원을 그립니다");
	}

	protected void delete() {
		System.out.println("원을 지웁니다");
	}
	
	public void sayCircle() {
		System.out.println("안녕하세요 원입니다");
	}
}

class Triangle extends Shape{

	protected void draw() {
		System.out.println("삼각형을 그립니다");
	}

	protected void delete() {
		System.out.println("삼각형을 지웁니다");
	}
	
	public void sayTriangle() {
		System.out.println("안녕하세요 삼각형입니다.");
	}
}