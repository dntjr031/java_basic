package com.day12;

import java.util.Scanner;

public class Exam2 {
	
	public static int add(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
	
	public static double average(int add, int count) {
		double avg = (double)add/count;
		
		return avg;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("평균을 구할 행과 열의 개수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[][] arr = new int[a][b];
		
		System.out.println(a + "행, " + b + "열의 정수를 입력하세요");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int add = add(arr);
		int count = arr.length * arr[0].length;
		
		double avg = average(add, count);
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n총합 : " + add);
		System.out.println("평균 : " + avg);
		
		
		sc.close();

	}

}
