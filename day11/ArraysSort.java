package com.day11;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		// public static void sort(int[] a)
		//=> �ش� �迭�� ������������ �������ִ� �޼���
		
		int[] arr = {79,12,66,100,3,27,10,85};
		
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
		System.out.println("\n\n====���� �� �迵 ���====");
		
		Arrays.sort(arr);
		
		for(int n : arr) {
			System.out.print(n + " ");
		}

	}

}
