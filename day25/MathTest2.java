package com.day25;

public class MathTest2 {

	public static void main(String[] args) {
		System.out.println("1~50 사이의 난수");
		for (int i = 0; i < 10; i++) {
			System.out.print((int)(Math.random()*50+1) + " ");
		}
	}

}
