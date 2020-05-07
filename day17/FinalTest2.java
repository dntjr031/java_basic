package com.day17;

public class FinalTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Parent4{
	public void func() {
		System.out.println("Parent");
	}
	public final void finalFunc() {
		System.out.println("pppppp");
	}
}

class Child4 extends Parent4{
	public void func() {
		super.func();
	}
	//public void finalFunc() {} // error => final method, 오버라이딩할 수 없다
}
