package com.day22.collection;

import java.util.ArrayList;

public class ArrayExam {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(3.14);
		list.add(5.87);
		list.add(2.476);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\n=====2번======");
		ArrayList<String> sList = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			sList.add((i+1) + " : Hello Java");
		}

		for(String s : sList) {
			System.out.println(s);
		}
	}

}
