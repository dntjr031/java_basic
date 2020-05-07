package com.day23;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTEst {

	public static void main(String[] args) {

		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		tset.add(10); // 저장될때마다 데이터가 정렬됨
		tset.add(2);
		tset.add(5);
		tset.add(99);
		tset.add(2);
		
		System.out.println("요소의 개수 : " + tset.size());
		
		Iterator<Integer> ir = tset.iterator();
		while(ir.hasNext()) {
			int n = ir.next();
			System.out.println(n);
		}
		
		TreeSet<String> tset2 = new TreeSet<String>();
		tset2.add("홍길동");
		tset2.add("김길동");
		tset2.add("이길동");
		tset2.add("java");
		tset2.add("abcdef");
		tset2.add("Oracle");
		tset2.add("78");
		
		System.out.println("요소의 개수 : " + tset2.size());
		
		Iterator<String> ir2 = tset2.iterator();
		while(ir2.hasNext()) {
			String s = ir2.next();
			System.out.println(s);
		}
	}

}
