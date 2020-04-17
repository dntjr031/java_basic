package com.day8;

public class CuntinueExam2 {

	public static void main(String[] args) {

		for(int i = 2; i <= 8; i += 2) {
			for(int j = 1; j <= i; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		
		for(int i = 1; i <= 25; i++) {
			if(i % 5 == 0) { 
				System.out.print(i + "\n");
				continue;
			}
			System.out.print(i + "\t");
		}
		
		System.out.println("==================================");
		
		for(int i = 0; i < 5; i++) {
			for(int j =1; j <= 5; j++) {
				
				System.out.print(j + i * 5 );
				if(j < 5) System.out.print("\t");
			}
			System.out.println();
		}

	}

}
