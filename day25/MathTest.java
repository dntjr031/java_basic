package com.day25;

public class MathTest {

	public static void main(String[] args) {
		double n = Math.abs(-27.6);
		System.out.println("���밪 : " + n);
		
		System.out.println("27.3 �ø� : " + Math.ceil(27.3)); // 28
		System.out.println("-27.3 �ø� : " + Math.ceil(-27.3)); // -27
		
		System.out.println("27.6���� : " + Math.floor(27.6)); // 27
		System.out.println("-27.6���� : " + Math.floor(-27.6)); // -28
		//-29	-27	-27.6	-27.3	-27	-26 ...	0	26	27	27.3	27.6	28
		
		
		System.out.println("27.6 �ݿø� : " + Math.round(27.6)); // 28
		
		System.out.println("random�� : " + Math.random());
		
		System.out.println("�ڿ��α��� ��" + Math.E);
		System.out.println("PI : " + Math.PI);
	}

}
