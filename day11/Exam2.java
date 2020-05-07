package com.day11;

import java.util.*;

public class Exam2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		System.out.println("5개의 숫자를 입력하세요");
		for(int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("===내림차순으로 정렬===");
		int num = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < i; j++) {
				if(a[i] > a[j]) {
					num = a[i];
					a[i] = a[j];
					a[j] = num;
				}
			}
		}
		
		for(int n : a) {
				System.out.print(n + " ");
		}
		
		System.out.println("\n\n===내림차순으로 정렬(메서드 이용)===");
		
		Integer[] a2 = new Integer[5];
		System.out.println("5개의 숫자를 입력하세요");
		for(int i = 0; i < 5; i++) {
			a2[i] = sc.nextInt();
		}
		
		Arrays.sort(a2, Collections.reverseOrder());
		
		for(int n : a2) {
			System.out.print(n + " ");
		}
		
		sc.close();

	}

}
