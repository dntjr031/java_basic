package com.day23;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("first");
		hset.add("second");
		hset.add("third");
		hset.add("first"); //�ߺ����� �Է� X
		
		System.out.println("set�� ����� ���� : " + hset.size());
		
		Iterator<String> iter = hset.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		
		
	}

}
