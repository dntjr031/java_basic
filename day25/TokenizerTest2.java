package com.day25;

import java.util.StringTokenizer;

public class TokenizerTest2 {

	public static void main(String[] args) {
		String str = "1,ȫ�浿,100,95,88|2,��浿,85,77,66|3,�̱浿,91,79,99";
		
		StringTokenizer st = new StringTokenizer(str, "|");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			
			StringTokenizer st2 = new StringTokenizer(token,",");
			while(st2.hasMoreTokens()) {
				System.out.println(st2.nextToken());
			}
			System.out.println("=========");
			
		}
		
		/*
		 ���ڿ��� ���Ե� �����Ͱ� �� ���� ������ �����ڷ� �������� ���� ��
		 �� ���� StringTokedizer�� ���� �ݺ����� ����ؼ� ó��
		 
		 �� �л��� ������ �����ϱ� ���� "|"�� ���
		 �л��� �̸��� ���� ���� �����ϱ� ���� ","fmf tkdyd
		 */
		
		//split()�̿�
		System.out.println("\n====split() �̿�====");
		
		String[] s = str.split("\\|");
		for (int i = 0; i < s.length; i++) {
			String[] sarr = s[i].split(",");
			
			for (int j = 0; j < sarr.length; j++) {
				System.out.println(sarr[j]);
			}
			System.out.println("----------");
		}
	}

}
