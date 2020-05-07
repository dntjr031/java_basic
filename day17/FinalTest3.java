package com.day17;

public class FinalTest3 {

	public static void main(String[] args) {
		int num = 10;
		final double INTEREST_RATE=1.6;
		
		AAA obj = new AAA();
		System.out.println("num=" + num + ", obj.PI=" + obj.PI);
		System.out.println("배송비 : " + AAA.DELIVERY);
		System.out.println("이자율 : " + INTEREST_RATE);

		obj.age = 25;
		//obj.PI = 3.14; // final double
		//AAA.DELIVERY = 2500; // 상수는 값 변경 불가, final static int
		
		num = 30;
		//INTEREST_RATE = 1.8; final double
	}

}

class AAA{
	public final double PI = 3.141592;
	final static int DELIVERY = 3000;
	int age;
}
