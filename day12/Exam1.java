package com.day12;

import java.util.Scanner;

public class Exam1 {
	
	public static int[][] matrix(int a) {
		int[][] arr = new int[a][a];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i == j) {
					arr[i][j] = 1;
				}
			}
		}
		return arr;
	}
	
	public static int[][] xMatrix(int a) {
		int[][] arr = new int[a][a];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i == j || i+j == arr.length-1) {
					arr[i][j] = 1;
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		int[][] arr1 = new int[3][3];
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if(i == j) {
					arr1[i][j] = 1;
				}
			}
		}
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("========2========");
		
		int[][] arr = new int[3][3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i == j || i+j == arr.length-1) {
					arr[i][j] = 1;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] + "\t");
				
			}
			System.out.println();
		}
		
		System.out.println("========3========");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("단위행렬을 구할 수를 입력하세요<끝내려면 0>");
			int num = sc.nextInt();
			if(num == 0) break;
			
			int[][] matrix = matrix(num);
			int[][] xmatrix = xMatrix(num);
			
			System.out.println(num +"차 단위행렬 :");
			
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println();
			
			for (int i = 0; i < xmatrix.length; i++) {
				for (int j = 0; j < xmatrix[i].length; j++) {
					System.out.print(xmatrix[i][j] + "\t");
				}
				System.out.println();
			}
		}
		System.out.println("종료하였습니다.");
		
		sc.close();

	}

}
