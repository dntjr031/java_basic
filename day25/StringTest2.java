package com.day25;

public class StringTest2 {

	public static void main(String[] args) {
		String str1 = "Happy";
		String str2 = " and ";
		String str3 = "Smile";
		String str4 = str1.concat(str2).concat(str3); // String str4 = str1 + str2 + str3
		// public String concat(String str)
		//�� 3���� ���ڿ��� �ϳ��� ������ �̸� ���ؼ� �߰��� ������ �ν��Ͻ��� ���� 2��
		/*
		 StringBuilder sb = new StringBuilder(str1);
		 sb.append(str2).append(str3);
		 String s = sb.toString();
		 */
		System.out.println(str4);
		
		//public int compareTo(String anotherString)
		//=> this.charAt(k) - anotherString.charAt(k);
		if(str1.compareTo(str3) < 0) {
			System.out.println("str1�� �ռ���"); //str1�� �� �۴�
		}else {
			System.out.println("str3�� �ռ���");
		}
	}

}
