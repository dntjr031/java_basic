package com.day10;

import java.util.Scanner;

public class FibonacciExam {
	
	public static int fib(int i) {
		
		int result = 0;
					
		if(i == 0) {
			result = 0;
		}else if(i == 1) {
			result = 1;
		}else {
			result = fib(i - 2) + fib(i - 1);
		}
		
		return result;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("피보나치 수열을 구할 수를 입력");
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			System.out.print(fib(i));
			if(i < a - 1){
				System.out.print(", ");
			}
		}
		
		sc.close();
	}

}
