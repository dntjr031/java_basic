package com.day9;

public class MathodTest4 {

	
	// 1. �Ű�����(�Է°�)�� ����, ��ȯ���� ���� �޼����� ���
	public static void func1() {
		System.out.println("*********");
	}
		
	// 2. �Ű������� �ְ�, ��ȯ���� ���� �޼����� ���
	public static void func2(int count) {
		for(int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
		
	// 3. �Ű������� ����, ��ȯ���� �ִ� �޼����� ���
	public static float func3() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		float avg = sum/10f;
		
		return avg;
	}
		
	// 4. �Ű������� �ְ�, ��ȯ���� �ִ� �޼����� ���
	public static int func4(int a, int b) {
		int c = a + b;
		
		return c;
	}
	
	public static void main(String[] args) {
		// 1. �Ű�����(�Է°�)�� ����, ��ȯ���� ���� �޼����� ���
		func1(); //�׳� �ҷ����⸸ �ϸ� ��
		
		// 2. �Ű������� �ְ�, ��ȯ���� ���� �޼����� ���
		func2(5); // ���Ŀ� �°� �Ű��������� ����
		
		int cnt = 10; // ����ó�� �Ѱ� ���޵� ����
		func2(cnt);
		
		// 3. �Ű������� ����, ��ȯ���� �ִ� �޼����� ���
		float average = func3();
		
		System.out.println("\n1~10���� �հ��� ��� : " + average);
			
		// 4. �Ű������� �ְ�, ��ȯ���� �ִ� �޼����� ���
		int n1 = 5, n2 = 7;
		int sum = func4(n1, n2);
		
		System.out.println(n1 + " + " + n2 + " = " + sum);
	}

}
