package com.day12;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {

		int[] a = {1,2,3,4};
		int[] aPlus = Arrays.copyOf(a, 5);
		
		for(int n : aPlus) {
			System.out.print(n+ " ");
		}
		System.out.println();

		int[] aMinus = Arrays.copyOf(a, 3);
		
		for(int n : aMinus) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
