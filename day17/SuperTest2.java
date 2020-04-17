package com.day17;

public class SuperTest2 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2{
	protected int x = 10;
	
}

class Child2 extends Parent2{
	private int x = 20;
	
	public void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
	
}
