package com.day22;

public class ThrowsTest2 {
	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		method2();
	}
	
	public static void method2(){
		try {
			throw new Exception("������ ���� �߻���Ŵ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
