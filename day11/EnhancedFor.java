package com.day11;

public class EnhancedFor {

	public static void main(String[] args) {

		//Ȯ�� for�� (Enhanced for��)
		/*
		 * - �迭�̳� �÷����� ��ҵ��� �ݺ�ó���� �� ���
		 * 
		 * for(�ڷ��� ���� : �迭){
		 * 			�ݺ���;
		 * }
		 * 
		 */
		
		
		int[] arr = {10,50,78,99,63};
		
		System.out.println("====Ȯ�� for �̿�====");
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
		System.out.println("\n\n===for �̿�===");
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		String[] sArr = {"java","oracle", "jsp"};
		
		System.out.println("\n\n====Ȯ�� for====");
		for(String s : sArr) {
			System.out.print(s + "\t");
		}
		
		System.out.println("\n\n====for====");
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i] + "\t");
		}

	}

}
