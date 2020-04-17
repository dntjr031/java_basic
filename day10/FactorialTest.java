package com.day10;

public class FactorialTest {

	//재귀 호출 - 매서드 내부에서 메서드 자기 자신을 다시 호출하는 것
	//반복문의 효과가 있다.
	//그러나 비효율적
	/*
	 * 4! = 4*3*2*1
	 * 
	 * 4! = 4 * 3!
	 * 			3 * 2!
	 * 				2 * 1!
	 * 					1
	 * 
	 * 수학적 함수로 표현
	 * f(n) = n * f(n-1)  단, f(1) = 1
	 * 
	 */
	
	public static int factorial(int n) {
		int result = 0;
		
		if(n == 1) {
			result = 1;
		}else {
			result = n * factorial(n-1);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("4! => " + factorial(4));

	}

}
