package com.day11;

public class ArraySwap {

	public static void main(String[] args) {
		
		//�迭������ ���縦 �̿��ؼ� �� �迭�� �¹ٲ۴� - swap
		
		int[] arr = {1,2,3};
		int[] oddArr = {1,3,5,7,9};
		
		System.out.println("==ó�� ������ arr �迭 ���==");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n\n==oddArr �迭 ���==");
		for(int i = 0; i < oddArr.length; i++) {
			System.out.print(oddArr[i] + " ");
		}
		
		// swap
		int[] temp;
		
		temp = arr;
		arr = oddArr;
		oddArr = temp;
		
		System.out.println("\n\n====swap �� arr ���====");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n\n====swap �� oddArr ���====");
		for(int i = 0; i < oddArr.length; i++) {
			System.out.print(oddArr[i] + " ");
		}

	}

}
