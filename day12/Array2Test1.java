package com.day12;

public class Array2Test1 {

	public static void main(String[] args) {
		// 2���� �迭
		//�ڹ��� ������ �迭���� �� ������ ��� reference�� ǥ���ϴ� �����̰�,
		// ������ �迭 �������� ���� �����͸� ��Ÿ���� ������
		
		//[1] �迭 ����, �޸� �Ҵ�� �ʱ�ȭ�� ������
		//�迭 ����
		int[][] arr;
		//�޸� �Ҵ�
		arr = new int[2][3]; //2�� 3��
		//�ʱ�ȭ
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 25;
		arr[1][0] = 11;
		arr[1][1] = 34;
		arr[1][2] = 58;
		//���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		//�迭 ����� �޸� �Ҵ��� ���ÿ�
		int[][] arr2 = new int[3][2];
		
		//[2] �迭 ����, �޸��Ҵ�, �ʱ�ȭ�� ��� ���ÿ�
		int[][] arr3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[0].length; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("arr2�� ���� ���� : " + arr2.length);
		System.out.println("arr2�� ���� ���� : " + arr2[0].length);
		
		/*
		int arr4[][]; //����
		int[] arr5[]; //����
		
		int[][] arr6 = new int[][] {{11,21,31},{41,51,61}}; //����
		
		int[][] arr7;
		arr7 = new int[][] {{1,2},{3,4},{5,6}}; // ����
		*/
		
		//int[][] arr8 = new int[2][2];
		//arr8 = {{1,2},{3,4}}; //error

	}

}
