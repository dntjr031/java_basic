package com.day24;

public class StringTest2 {
	public static void main(String[] args) {
		String str = "12345678";
		String s = str.replace('7', 'ĥ');
		System.out.println("7�� ĥ�� ġȯ : " + s);;
		
		System.out.println("45�� four,five�� ġȯ : " + str.replace("45", "four,five"));
		
		System.out.println("\n===,�� �����ڷ� ���� ���");
		str = "java,oracle,html,css";
		String[] arr = str.split(","); // , �� �����ڷ� �������� �и�
		for(String st : arr) {
			System.out.println(st);
		}
		
		System.out.println("\n===.�� �����ڷ� ���� ���");
		str = "jsp.spring.mybatis.python";
		//public String[] split(String regex, int limit)
		String[] arr2 = str.split("\\.", 3);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
