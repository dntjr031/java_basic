package com.day15;

public class StaticTest {
	private int num1;
	private static int num2;
		
	public int add() {
		return num1 + num2;
	}
	
	public static int multiply(int a, int b) {
		//int result = num1 * num2; //error
		// static �޼��忡���� static�� ���� ����
		// => �ν��Ͻ� ��������� num1�� ���� �Ұ�
		return a * b;
	}
	
	
	public static void main(String[] args) {
		int result = StaticTest.multiply(10, 30);
		// => static �޼��� ȣ�� : Ŭ������.�޼���();
		System.out.println("�μ��� �� : " + result);
		
		result = multiply(20, 40);
		// => ���� Ŭ���������� Ŭ������ �����ϰ� �޼���� ȣ�� ����
		System.out.println("�μ��� �� : " + result);
		
		//result = add(); // error
		//=> static������ static�� ���� �����ϹǷ�
		// static �޼����� main������ �ν��Ͻ� �޼��� ���� �Ұ�
		
		StaticTest.num2 = 7;
		StaticTest obj = new StaticTest();
		obj.num1 = 5;
		
		result = obj.add(); //���� Ŭ�������� ��ü ���� �� �ν��Ͻ� �޼��� ����
		System.out.println("�μ��� �� : " + result);

	}

}
