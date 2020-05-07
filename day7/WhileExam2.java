package com.day7;

import java.util.Scanner;

public class WhileExam2 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			System.out.println("숫자를 입력하세요(끝내려면 0 입력)");
			int num = sc.nextInt();
			
			if(num == 0) break;
			
			sum += num;
		}
		System.out.println("입력된 숫자의 합 : " + sum);
		
		
		System.out.println("\n=======전체 평균========\n");
		
		
		System.out.println("입력할 정수의 개수를 입력하세요");
		int count = sc.nextInt();
		
		sum = 0;
		double cnt = 0;
		while(true) {
			
			System.out.println("정수를 입력하세요");
			int i = sc.nextInt();
			
			sum += i;
			cnt++;
			
			if(--count == 0) break;
			
		}
		long rnd = Math.round(sum / cnt * 100);
		
	
		System.out.println("입력된 정수의 전체 평균 : " + rnd / 100.0);
		
		sc.close();
			
	}

}
