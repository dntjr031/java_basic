package com.day8;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {

		// 사용자로부터 입력받은 숫자들의 합을 구해 출력
		// 사용자가 0을 입력할 때까지 반복
		
		//1. 스캐너 입력
		Scanner sc = new Scanner(System.in);
		
		//2. 입력받을 변수와 더해질 변수 선언
		int num;
		int sum = 0;
		do{
			
			//3. do~while로 사용자로부터 정수 입력받음
			System.out.println("숫자를 입력하세요");
			num = sc.nextInt();
			
			//4. 입력받은 정수를 더함	
			sum += num;
			
		//5. 탈출조건 입력
		}while(num != 0);
		
		//6. 누적한 숫자의 합을 입력
		System.out.println("\n입력된 숫자의 합 : "+ sum);
		
		//7. 스캐너 닫음
		sc.close();

	}

}
