package com.day23;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTEst {

	public static void main(String[] args) {

		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		tset.add(10); // ����ɶ����� �����Ͱ� ���ĵ�
		tset.add(2);
		tset.add(5);
		tset.add(99);
		tset.add(2);
		
		System.out.println("����� ���� : " + tset.size());
		
		Iterator<Integer> ir = tset.iterator();
		while(ir.hasNext()) {
			int n = ir.next();
			System.out.println(n);
		}
		
		TreeSet<String> tset2 = new TreeSet<String>();
		tset2.add("ȫ�浿");
		tset2.add("��浿");
		tset2.add("�̱浿");
		tset2.add("java");
		tset2.add("abcdef");
		tset2.add("Oracle");
		tset2.add("78");
		
		System.out.println("����� ���� : " + tset2.size());
		
		Iterator<String> ir2 = tset2.iterator();
		while(ir2.hasNext()) {
			String s = ir2.next();
			System.out.println(s);
		}
	}

}
