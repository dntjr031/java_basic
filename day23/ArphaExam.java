package com.day23;

import java.util.*;

public class ArphaExam {

	public static void main(String[] args) {
		System.out.println("-----ArrayList 이용-----");
		ArrayList<Character> carr = new ArrayList<Character>();
		for (int i = 0; i < 26; i++) {
			carr.add((char) ('A' + i));
		}
		for(char c : carr) {
			System.out.print(c + " ");
		}
		
		
		System.out.println("\n\n-----HashMap 이용-----");
		HashMap<Integer, Character> marr = new HashMap<Integer, Character>();
		for (int i = 0; i < 26; i++) {
			marr.put(i, (char)('A' + i));
		}
		
		Iterator<Integer> ir = marr.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			char c = marr.get(key);
			System.err.print(c + " ");
		}
		
		
		System.out.println("\n\n-----HashSet 이용-----");
		HashSet<Character> sarr = new HashSet<Character>();
		for (int i = 0; i < 26; i++) {
			sarr.add((char)('A' + i));
		}
		Iterator<Character> cir = sarr.iterator();
		while(cir.hasNext()) {
			System.out.print(cir.next() + " ");
		}
	}

}
