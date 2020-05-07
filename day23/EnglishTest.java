package com.day23;

import java.util.*;


public class EnglishTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("boy", "소년");
		map.put("girl", "소녀");
		map.put("school", "학교");
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(key + " => " + value);
		}
		
		System.out.println("\nforEach 사용");
		map.forEach((key, value) -> System.out.println(key + " => " + value));
	}

}
