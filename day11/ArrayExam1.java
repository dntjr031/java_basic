package com.day11;

import java.util.Scanner;

public class ArrayExam1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("횟수");
		int count = sc.nextInt();
		int[] arr = new int[count];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		System.out.println("\n=====================\n");
		
		int[] arr2 = new int[5];
		
		for(int i = 0; i < arr2.length; i++) {
			
			arr2[i] = i * 2 + 1;
		}
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		
		
		sc.close();

	}

}
