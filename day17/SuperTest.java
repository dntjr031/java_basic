package com.day17;

public class SuperTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		

	}

}

class Parent{
	int x = 10;
}

class Child extends Parent{
	int x = 20;
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
		/*
		this	- �ڽ��� ����� �����ϴ� this
	 	this()	- �ڽ��� �����ڸ� ȣ���ϴ� this()
		 
		super 	- �θ��� ����� �����ϴ� super
		super()	- �θ��� �����ڸ� ȣ���ϴ� super()
		 */
	}
}
