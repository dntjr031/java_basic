package com.day11;

public class ArrayCopy {

	public static void main(String[] args) {

		/*
		 * �迭 ������ ����� �迭 ���� ��ü�� ����
		 * �迭�� �ν��Ͻ��� ������� ����
		 * �迭�� �������̹Ƿ� �迭���縦 �ϰ� �Ǹ� ���� �޸� ������ ����Ű�� ��
		 */
		
		int[] arr = new int[3];
		int[] copy = arr; // copy�� arr�� ���� �޸� ������ ����Ű�� ��
		
		arr[0]++;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n\n=======copy �迭�� ���=======");
		
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();

	}

}
