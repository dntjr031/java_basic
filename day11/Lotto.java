package com.day11;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		
		//�ζ� �����
		//1. 6�� ������ ���� �迭 �����

		int[] lotto = new int[6];

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//2. for������ 1~45 ������ ������ ������ �迭 ��ҿ� �ִ´�
			//for������ �ʱ�ȭ
			for(int i = 0; i < 6; i++) {
				
				lotto[i] = (int)(Math.random()*45+1);
				
				//�ߺ�����
				for(int n = 0; n < i; n++) {
					if(lotto[i] == lotto[n]){
						i--; 
						break;
					}
				}
			}
			//3. �迭 ��� ����
			Arrays.sort(lotto);
			//4. �迭 ��� ���
			for(int n : lotto) {
				System.out.print(n + " ");
			}
			System.out.println("\n\n��� �Ͻðڽ��ϱ�? (y/n)");
			
			String str = sc.nextLine();
			if(str.equalsIgnoreCase("n")) break;
		}
		
		sc.close();

	}

}
