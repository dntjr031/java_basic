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
		this	- 자신의 멤버를 참조하는 this
	 	this()	- 자신의 생성자를 호출하는 this()
		 
		super 	- 부모의 멤버를 참조하는 super
		super()	- 부모의 생성자를 호출하는 super()
		 */
	}
}
