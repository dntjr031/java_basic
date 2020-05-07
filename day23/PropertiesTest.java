package com.day23;

import java.util.*;

public class PropertiesTest {

	public static void main(String[] args) {
		/*
		 Properties - HashMap의 구버젼인 Hashtable을 상속한 클래스
		 (key, value) => (String, String) 으로 단순화한 형태
		 환경설정등에 주로 사용
		 파일로부터 값을 읽어서 저장 가능
		 */
		Properties pro = new Properties();
		// 저장
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
		
		//값 변경
		pro.setProperty("size", "20");
		
		//public String getProperty(String key, String value)
		String value = pro.getProperty("capacity", "10");
		System.out.println("\ncapacity => " + value);
		System.out.println("lang=> " + pro.getProperty("lang", "java"));
		
		System.out.println("\n요소의 개수 : " + pro.size());
	}

}
