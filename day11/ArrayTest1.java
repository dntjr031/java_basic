package com.day11;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		//for 문 안에서 배열 초기화하기
		//[1] 일정한 규칙이 있는 값으로 초기화하는 경우
		//5,10,15,20,25
		int[] arr1;
		arr1 = new int[5];
		/*
		arr1[0] = 5;
		arr1[1] = 10;
		arr1[2] = 15;
		arr1[3] = 20;
		arr1[4] = 25;
		*/
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = 5*(i+1);
		}
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}
		
		//[2] 사용자로 부터 입력 받은 4개의 값(double)으로 초기화하는 경우
		Scanner sc = new Scanner(System.in);
		
		double[] arr2 = new double[4];
		System.out.println("\n4개의 정수를 입력하세요");
		arr2[0] = sc.nextDouble();
		arr2[1] = sc.nextDouble();
		arr2[2] = sc.nextDouble();
		arr2[3] = sc.nextDouble();
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		
		double[] arr3 = new double[4];
		
		System.out.println("\n4개의 정수를 입력하세요");
		for(int i = 0; i < arr2.length; i++) {
			arr3[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] = " + arr3[i]);
		}
		
		sc.close();

	}

}
