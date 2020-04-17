package com.day23;

import java.util.TreeSet;

public class HeadSetTest {

	public static void main(String[] args) {
		int[] arr = {85,95,50,35,45,65,10,100};
		
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			tset.add(arr[i]);
		}
		
		System.out.println(tset);
		System.out.println("50���� ���� ���" + tset.headSet(50));
		System.out.println("50���� ū ���" + tset.tailSet(50));
		System.out.println("���� �˻�(65 <= x < 95) : " + tset.subSet(65, 95));
		
	}

}
