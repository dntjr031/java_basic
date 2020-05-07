package com.day11;

import java.util.Scanner;

public class ArrayParam {
	//국, 영, 수 점수가 들어간 배열을 매개변수로 받아 평균을 리턴하는 메서드
	//배열이 매개변수인 경우
	
	
	public static double findTotal(int[] score) {
		//call by reference : 매개변수에 주소가 넘어감
		//=> 메서드에서 매개변수의 값을 변경하면 해단 메서드를 호출한 곳(main)에서도
		// 변경의 영향을 받는다(값이 변경도니다)
		
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		double avg = (double)sum/score.length;
		score[0]++; // 값 증가  76 => 77
		
		return Math.round(avg*100)/100.0;
	}
	
	public static int add(int a, int b) {
		//call by value : 매개변수에 값이 넘어감
		//=> 메서드에서 매개변수의 값을 변경해도 해당 메소드를 호출한 곳(main)에서는
		//영향받지 않는다
		
		int c = a + b;
		a++;
		return c;
	}
	
	
	public static void main(String[] args) {
		
		int a = 5, b = 7;
		int result1 = add(a, b); //call by value
		System.out.println(result1 + ", a = " + a); //변경 x
		
		
		int[] avg = {76,70,84};
		double result = findTotal(avg); //call by reference
		
		System.out.println("평균 : " + result + ", avg[0] = " + avg[0]); // 값 변경 됨 76 => 77

		
		int[] score = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력");
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		double total = findTotal(score);
		
		System.out.println("평균 : " + total);
		
		sc.close();

	}

}
