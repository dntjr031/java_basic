package com.day25;

import java.util.StringTokenizer;

public class TokenizerTest3 {

	public static void main(String[] args) {
		/*
		 split()�� �� ���ڿ��� ��ū���� �ν��ϴ� �ݸ�
		 StringTokenizer�� �� ���ڿ��� ��ū���� �ν����� �ʱ� ������
		 �ν��ϴ� ��ū�� ������ ���� �ٸ�
		 */
		System.out.println("====split�̿�====");
		String str = "100,,,200,300,400";
		String[] s = str.split(",");
		System.out.println("���� : " + s.length);
		for(String st : s) {
			System.out.print(st +"|");
		}
		
		System.out.println("\n====token�̿�====");
		StringTokenizer stt = new StringTokenizer(str, ",");
		
		int count = 0;
		while(stt.hasMoreTokens()) {
			System.out.print(stt.nextToken() + "|");
			count++;
		}
		System.out.println("\n���� : " + count);
	}

}
