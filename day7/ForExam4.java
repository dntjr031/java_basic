package com.day7;

public class ForExam4 {

	public static void main(String[] args) {
		System.out.println("\n=====1¹ø======\n");

		int sum = 0;
		for(int i = 1; i <=20; i++) {
			if(!(i % 2 != 0 || i % 3 != 0)) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		System.out.println("\n=====2¹ø======\n");
		
		int a = 0;
		sum = 0;
		for(int i = 1; i <= 10; i++) {
			
			sum += i;
			
			a += sum;
			
		}
		System.out.println(a);
		
		System.out.println("\n=====3¹ø======\n");
		
		for(int i = 1; i <= 6; i++) {
			for(int k = 1; k <=6; k++) {
				if(i + k ==6) {
					System.out.println(i + " + " + k + " = " + 6);
				}
			}
		}

	}

}
