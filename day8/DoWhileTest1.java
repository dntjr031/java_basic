package com.day8;

public class DoWhileTest1 {

	public static void main(String[] args) {
		// do ~ while
		/*
		 * 	do{
		 * 		��ɹ�;
		 * 	}while(���ǽ�);
		 
		 => ������ �����̴��� �ּ��� �ѹ��� ��ɹ� ����
		 ���� ������ ���� ���� ��ɹ��� �ݺ�
		 */

		int k = 1;
		do {
			System.out.println("���� k�� �� : " + k);
			k++;
		}while (k > 3);
		
		System.out.println("\n=================");
		
		k = 0;
		do {
			System.out.println("k : " + k);
			k++;
		}while(k < 3);

	}

}
