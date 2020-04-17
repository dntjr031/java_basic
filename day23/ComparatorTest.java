package com.day23;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorTest {

	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>();
		
		tset.add("individual");
		tset.add("dog");
		tset.add("orange");
		tset.add("apple");
		
		//�⺻���� ������� ó�� - �����ڵ� ��
		Iterator<String> ir = tset.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}

		System.out.println();
		//���ο� ���� ������ ���� - ���ڿ� ���̼�(������)
		// public TreeSet(Comparator<? super E> comparator)
		TreeSet<String> tset2 = new TreeSet<String>(new StrLenComparator());
		
		tset2.add("individual");
		tset2.add("dog");
		tset2.add("orange");
		tset2.add("apple");
		
		Iterator<String> ir2 = tset2.iterator();
		while(ir2.hasNext()) {
			System.out.println(ir2.next());
		}
	}

}

class StrLenComparator implements Comparator<String>{
	
	public int compare(String s1, String s2) {
		if(s1.length() > s2.length()) {
			return 1;
		}else if(s1.length() == s2.length()) {
			return 0;
		}else {
			return -1;
		}
	}
}