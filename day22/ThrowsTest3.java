package com.day22;

import java.io.IOException;

public class ThrowsTest3 {

	public static void main(String[] args) {
		// public abstract int read() throws IOException
		
		System.out.println("��(M), ��(F) ����!");
		try {
			char ch = (char)System.in.read();
			String str = "";
			switch(Character.toUpperCase(ch)){
				case 'M': str = "���ڽñ���"; break;
				case 'F': str = "���ڽñ���"; break;
				default: str = "�߸� �Է�!";
			}
			System.out.println(str);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
