package com.day10;

public class OverloadingTest {
	/*
	 * �����ε� �޼���
	 * - �ϳ��� Ŭ�������� ������ �̸��� ���� ���� ���� �޼��带 �����ε� �޼����� ��
	 * ��, �Ű������� ������ �ڷ����� �޶�� ��
	 */
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static float add(float a, float b) {
		return a + b;
	}
	
	public static float add(float a, float b, float c) {
		return a + b + c;
	}
	
	/*
	public static double add(int a, int b) {
		return a + b;
	}
	=> ��ȯŸ���� �ٸ����� �����ε� �޼��尡 �ƴ�
	�Ű������� �����Ƿ� ����!
	*/
	
	public static String add(String a, String b) {
		return a + b;
	}

	public static void main(String[] args) {

		int i = add(3, 5);
		float f = add(3f, 5f);
		float f2 = add(3f, 5f, 7f);
		String str = add("Hello", "Java");
		System.out.println("int �� : " + i + ", float �� : " + f + ", float 3�� �� : " + f2);
		System.out.println("Strint �� : " + str);

	}

}
