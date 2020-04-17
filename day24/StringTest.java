package com.day24;

public class StringTest {

	public static void main(String[] args) {
		// 01234567890123456789
		String str = "Hello java, Hi java!";

		char c = str.charAt(4);
		System.out.println("index�� 4�� �ش��ϴ� ���� => " + c); // 'o'

		// indexOf : Ư�� ���ڿ��� ��ġ�� ���� �� ���
		// �ش� ���ڿ��� �������� ������ -1�� ����
		int i = str.indexOf("java");
		System.out.println("java�� ��ġ : " + i); // 6

		i = str.lastIndexOf("java");
		System.out.println("�ڿ��� ã��java�� ��ġ" + i); // 15

		// substring(begin, end) : Ư�� ���ڿ��� ������ �� ���
		// begin <= x < end ������ ���ڿ� ����
		String s = str.substring(6, 10);
		System.out.println("6 <= x < 10 ������ ���ڿ� : " + s); // java

		s = str.substring(12);
		System.out.println("12 ���� �������� ���ڿ� : " + s); // Hi java!

		String url = "www.naver.com";
		if (url.startsWith("www")) {
			System.out.println("url�� www�� ���۵�"); //
		} else {
			System.out.println("url�� www�� ���۾ȵ�");
		}

		if (url.endsWith("com")) {
			System.out.println("url�� com���� ����"); //
		}else {
			System.out.println("url�� com���� ������ ����");
		}
		
		//				0123456789012
		String email = "hong@nate.com";
		if(email.indexOf("@") != -1 && email.indexOf(".") != -1){
			System.out.println("�̸��� ��Ģ�� �½��ϴ�.");
		}else {
			System.out.println("�̸��� ��Ģ�� ���� �ʽ��ϴ�.");
		}
				
		System.out.println();
		
		String em1 = email.substring(0,4); // hong
		String em2 = email.substring(5,9); // nate
		String em3 = email.substring(10); // com
		
		//*******
		int at = email.indexOf("@");
		int dot = email.indexOf(".");
		em1 = email.substring(0,at);
		em2 = email.substring(at+1,dot);
		em3 = email.substring(dot+1);
		
		System.out.println("@�� => " + em1);
		System.out.println("@~. => " + em2);
		System.out.println(". ���� => " + em3);
		
		String s2 = "  java, python!  ";
		System.out.println("[" + s2 + "]");
		System.out.println("���ڿ� ���� : " + s2.length());
		
		String s3 = s2.trim();
		System.out.println("trim �� [" + s3 + "]");
		System.out.println("trim �� ���� : " + s3.length());
		
		int n = 10;
		
		String s4 = Integer.toString(n);
		System.out.println("int�� ���ڿ��� ��ȯ - toString():" + s4);
		s4 = String.valueOf(n);
		System.out.println("int�� ���ڿ��� ��ȯ - valueOf():" + s4);
		
	}

}
