package com.day16;

public class CallStachTest {

	public static void main(String[] args) {
		int a = 10;
		int n = firstMethod(a);
		System.out.println(n);
	}
	
	public static int firstMethod(int a) {
		int b = 20;
		secondMethod();
		
		return a + b;
	}
	
	public static void secondMethod() {
		int c = 30;
		System.out.println(c);
	}

}
