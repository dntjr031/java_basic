package com.day6;

import java.io.IOException;

public class SwitchTraining {

	public static void main(String[] args) throws IOException {
		
		System.out.println("�ֹι�ȣ ���ڸ� ù��° ���ڸ� �Է��Ͻÿ�<1,2,3,4>");
		int num = System.in.read();
		
		char gender = (char)num;
		
		String result = "";
		switch(gender) {
			case '1': case '3':
				result = "����";
				break;
			case '2': case '4':
				result = "����";
				break;
			default:
				result = "�߸��Է�!";
			
		}
		System.out.println(result);

	}

}
