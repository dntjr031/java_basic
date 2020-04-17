package com.day6;

import java.io.IOException;

public class SwitchTest3 {

	public static void main(String[] args) throws IOException{
		/*
		  public abstract int read() throws IOException
		  - Ű����� ����1����Ʈ�� �о���� �޼���
		  - �Է��� ���� �ƽ�Ű�ڵ� ���� ��������
		  - char ���� �о�� �� ���
		  ��) ABC�Է� => ó�� 1����Ʈ�� A�� �о����, �ش� �ƽ�Ű�ڵ尪�� 65�� ���� 
		*/
		
		System.out.println("������ �Է��ϼ���(M/F)");
		int code = System.in.read();
		char gender = (char)code;
		
		System.out.println("�ڵ尪 : " + code + ", �ش繮�� : " + gender);
		
		String result = "";
		switch(gender) {
		
			case 'M':
				result = "����";
				break;
			case 'F':
				result = "����";
				break;
			default:
				result = "�߸��Է�!";
				break;
		}
		
		System.out.println(gender + " => " + result);
		
		//�ҹ��� m�̳� f�� ó���ǵ���
		switch(gender) {
		
			case 'M':
			case 'm':		//or�� ����� �� �� �ִ�.(�빮��M �̰ų� �ҹ���m�̸� ����)
				result = "����";
				break;
			case 'F':
			case 'f':
				result = "����";
				break;
			default:
				result = "�߸��Է�!";
				break;
		}
		
		System.out.println(gender + "(oró��) => " + result);
		
		//public static char toUpperCase(char ch)
		char upperGender = Character.toUpperCase(gender);
		
		switch(upperGender) {
		
			case 'M':
				result = "����";
				break;
			case 'F':
				result = "����";
				break;
			default:
				result = "�߸��Է�!";
				break;
		}
		
		System.out.println(gender + "(upper) => " + result);

	}

}
