package com.day10.array;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 배열의 갯수를 입력하세요");
		int count = sc.nextInt();
		
		int[] arr = new int[count];
		
		for(int i = 0; i < count; i++) {
			arr[i] = i;
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		System.out.println("================================");
		
		int[] arr2 = new int[5];
		int a = 1;
		for(int i = 0; i < arr2.length; i++) {
			
			arr2[i] = a;
			a += 2;
		}
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
			
			
		sc.close();
	}

}
