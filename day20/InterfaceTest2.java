package com.day20;

class AAA{
	/*
	public void methodA(BBB b) {
		b.method();
	}*/
	public void methodA(CCC c) {
		c.method();
	}
}

class BBB{
	public void method() {
		System.out.println("BBB's Method");
	}
}

class CCC{
	public void method() {
		System.out.println("CCC's Method");
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		AAA a = new AAA();
		///a.methodA(new BBB());
		a.methodA(new CCC());
		
	}

}
