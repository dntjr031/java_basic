package com.day23;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTEst2 {
	public static void main(String[] args) {
		//로또
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		while(tset.size()<6) {
			int rnd = (int)(Math.random()*25+1);
			
			tset.add(rnd); // 중복되지 않고, 정렬되어 들어감
		}
		
		Iterator<Integer> ir = tset.iterator();
		while(ir.hasNext()) {
			int n = ir.next();
			System.out.print(n + " ");
			
		}
	}
}
