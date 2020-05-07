package com.day9;

public class MathodTest3 {
	//1. 메서드 정의
	//이자를 계산해주는 메서드
	public static double calcInterest(int money) {
		double interest = money * 0.016;
		
		return interest;
	}
	
	public static void main(String[] args) {
		//public char charAt(int index)
		String str = "java";
		char ch = str.charAt(0);
		
		//public static int parseInt(String s)
		String n = "123";
		int a = Integer.parseInt(n);
		
		System.out.println(ch +" "+ a);
		
		//2. 메서드 호출
		//public static double clacInerest(int money)
		double interest = MathodTest3.calcInterest(1000000);
		System.out.println("이자 : " + interest);
		
		int m = 100000;
		double d = calcInterest(m);
		System.out.println(m + "의 이자 : " + d);
		
		/*
		 *[1] static 메서드 호출
		 *	    클래스명.메서드();
		 *
		 *	단, 동일한 클래스 내의 메서드 호출 시 클래스명 생략 가능
		 *	메서드();
		 *
		 *[2] instance 메서드(static이 붙지 않은 메서드) 호출
		 *	   참조변수.메서드(); 
		 */

	}

}
