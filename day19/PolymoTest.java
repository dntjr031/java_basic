package com.day19;

public class PolymoTest {

	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.method();
		System.out.println("ch.x=" + ch.x); // 200
		
		Parent p = new Child(); // 다형성
		p.method(); // 자식의 오버라이딩 메서드
		System.out.println("p.x=" + p.x); //부모 참조변수로는 부모의 멤버만 접근 가능 => 100
		

	}

}

class Parent{
	protected int x = 100;
	
	public void method() {
		System.out.println("Parent의 메서드");
	}
}

class Child extends Parent{
	int x = 200;
	
	public void method() {
		System.out.println("Child의 메서드");
	}
}
