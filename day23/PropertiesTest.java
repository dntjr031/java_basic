package com.day23;

import java.util.*;

public class PropertiesTest {

	public static void main(String[] args) {
		/*
		 Properties - HashMap�� �������� Hashtable�� ����� Ŭ����
		 (key, value) => (String, String) ���� �ܼ�ȭ�� ����
		 ȯ�漳��� �ַ� ���
		 ���Ϸκ��� ���� �о ���� ����
		 */
		Properties pro = new Properties();
		// ����
		pro.setProperty("timeout", "30");
		pro.setProperty("language", "kr");
		pro.setProperty("size", "10");
		pro.setProperty("capacity", "10");
		
		Enumeration<?> en = pro.propertyNames();
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement();
			String value = (String)pro.getProperty(key);
			System.out.println("key=" + key + ", value=" + value);
		}
		
		//�� ����
		pro.setProperty("size", "20");
		
		//public String getProperty(String key, String value)
		String value = pro.getProperty("capacity", "10");
		System.out.println("\ncapacity => " + value);
		System.out.println("lang=> " + pro.getProperty("lang", "java"));
		
		System.out.println("\n����� ���� : " + pro.size());
	}

}
