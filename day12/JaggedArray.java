package com.day12;

public class JaggedArray {

	public static void main(String[] args) {
		//���� �迭(Jagged Array) - �����迭, ���߳��� �迭
		//�迭�� �� ���� ũ�⸦ �ٸ��� ������ �� �ִ�.
		
		// 2���� �迭
		int[][] arr = new int[2][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		//int[][] arr2 = {{1,2},{3,4},{5,6}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		// �����迭
		int[][] arr3 = new int[3][];
		
		arr3[0] = new int[4];
		arr3[1] = new int[2];
		arr3[2] = new int[3];
		
		arr3[0][0] = 1;
		arr3[0][1] = 2;
		arr3[0][2] = 3;
		arr3[0][3] = 4;
		arr3[1][0] = 5;
		arr3[1][1] = 6;
		arr3[2][0] = 7;
		arr3[2][1] = 8;
		arr3[2][2] = 9;
		
		System.out.println("\n\n====���� �迭====");
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		/*
		int[][] arr4 = {{1,2,3},{1,2},{1,2,3,4,5,6}};
		int[][] arr5 = {new int[]{1,2,3},
					new int[]{1,2},
					new int[]{1,2,3,4,5,6}};
		
		int[][] arr6 = new int[3][];
		arr6[0] = new int[] {10,20,30,40};
		arr6[1] = new int[] {50,60};
		arr6[2] = new int[] {70,80,90,100,110};
		*/
	}

}
