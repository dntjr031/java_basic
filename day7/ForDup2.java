package com.day7;

public class ForDup2 {

	public static void main(String[] args) {
		System.out.println("====技肺备备窜====");

		for(int dan = 2; dan < 10; dan++) {
			
			for(int j = 1; j <10; j++) {
				System.out.println(dan + " * " + j + " = " + dan * j);
			}
			
			System.out.println();
		}
		
		System.out.println("====啊肺备备窜====");
		
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}

	}

}
