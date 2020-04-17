package com.day23;

import java.util.*;


public class EnglishTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("boy", "�ҳ�");
		map.put("girl", "�ҳ�");
		map.put("school", "�б�");
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(key + " => " + value);
		}
		
		System.out.println("\nforEach ���");
		map.forEach((key, value) -> System.out.println(key + " => " + value));
	}

}
