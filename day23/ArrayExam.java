package com.day23;

import java.util.*;

public class ArrayExam {

	public static void main(String[] args) {

		System.out.println("------ArratList �̿�------");
		ArrayList<Double> dArr = new ArrayList<Double>();
		for (int i = 0; i < 4; i++) {
			dArr.add(1.5 + i);
		}
		for(Double n : dArr) {
			System.out.println(n);
		}
		
		System.out.println("------�迭 �̿�------");
		double[] d = new double[4];
		for (int i = 0; i < d.length; i++) {
			d[i] = 1.5 + i;
		}
		for(double n : d) {
			System.out.println(n);
		}
		
		System.out.println("HashSet iterator<> �̿�");
		HashSet<Double> set = new HashSet<Double>();
		for (int i = 0; i < 4; i++) {
			set.add(1.5 + i);
		}
		Iterator<Double> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("HashSet foreach �̿�");
		set.forEach(System.out::println);
	}

}
