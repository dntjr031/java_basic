package com.day22;

public class ThrowsTest1 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("����:"+e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception{
		throw new Exception("���Ƿ� ���ܸ� �߻���!!");
		
		/*
		 �޼��忡�� ���ܸ� ó���ϴ� ���
		 [1] try~catch�� ���� ����ó��		 
		 [2] throws �� ���� ���ѱ��(���� ����, �޼��忡 ���� �����ϱ�)
		 
		 RuntimeException �迭�� ���ܵ��� ����ó�� ���� �ʾƵ� ��
		 ������ RuntimeException������ �ƴ� Exception ���� �ݵ�� ����ó�� �ؾ���
		 ����ó�� ���� ������ ������ ������ ��
		 */
	}
}
