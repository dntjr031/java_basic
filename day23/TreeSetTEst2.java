package com.day23;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTEst2 {
	public static void main(String[] args) {
		//�ζ�
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		while(tset.size()<6) {
			int rnd = (int)(Math.random()*25+1);
			
			tset.add(rnd); // �ߺ����� �ʰ�, ���ĵǾ� ��
		}
		
		Iterator<Integer> ir = tset.iterator();
		while(ir.hasNext()) {
			int n = ir.next();
			System.out.print(n + " ");
			
		}
	}
}
