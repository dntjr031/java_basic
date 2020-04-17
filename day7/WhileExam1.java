package com.day7;

public class WhileExam1 {

	public static void main(String[] args) {

		int i = 0;
		int num = 0;
		while(i <= 100) {
			num += i;
			i += 2;
			
		}
		System.out.println("[while]0~100까지 짝수의 합 : " + num);

		System.out.println("=====for=====");
		
		num = 0;
		for(int j = 0; j <= 100; j += 2) {
			num += j;
		}
		System.out.println("[for]0~100까지 짝수의 합 : " + num);
	}

}
