package com.day6;

public class ScopeTest1 {

	public static void main(String[] args) {

		// ������ ����(Scope)
		int a = 10; // main �޼��忡�� ����� �������� - main�� ����� �Ҹ�
					// main������ ��� ����
		//for(int a = 0; a < 3; a++) {} // �ߺ� error
		
		for(int i = 0; i < 3; i++) { // for ���ȿ��� ����� i�� for�� ����� �Ҹ�
			System.out.println("i=" + i);
		}
			
		for(int i = 0; i < 2; i++) {
			int n = 20; // for�� ����� n�� �Ҹ�
			System.out.println("n=" + n);
			System.out.println("i=" + i);
		}
		
		System.out.println("a=" + a);
		//System.out.println("n=" + n); // error
		//System.out.println("i=" + i); // error

	}

}
