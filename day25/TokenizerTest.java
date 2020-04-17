package com.day25;

import java.util.StringTokenizer;

public class TokenizerTest {

	public static void main(String[] args) {
		String str = "10,20,30,40";
		//public StringTokenizer(String str, String delim)
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		//split() �̿�
		System.out.println("split()�̿�");
		String[] sarr = str.split(",");
		for (int i = 0; i < sarr.length; i++) {
			System.out.println(sarr[i]);
		}
		
		System.out.println();
		
		str = "100+(200*300)/2";
		//public StringTokenizer(String str, String delim, boolean returnDelims)
		//=> �����ڵ� ��ū���� ����
		StringTokenizer st2 = new StringTokenizer(str, "+-*/=()", true);
		
		while(st2.hasMoreTokens()) {
			String token = st2.nextToken();
			System.out.println(token);
		}
		/*
		 StringTokenizer �� �� �� ������ �����ڸ� ����� �� �ֱ� ������,
		 +-/*=()  ��ü�� �ϳ��� �����ڰ� �ƴ϶� ������ ���ڰ� ��� ��������
		 �� ���� �̻��� �����ڸ� ����ؾ� �Ѵٸ� split() �޼��� �̿�
		 */
	}

}
