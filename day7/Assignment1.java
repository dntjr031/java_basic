package com.day7;

public class Assignment1 {

	public static void main(String[] args) {
		
		for(int i = 1; i <=5; i++) {
			for(int k = 0; k< 3; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= 5; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int i = 5; i >= 1; i--) {
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int i = 1; i <=11; i++) {
			//System.out.print(i);
			for(int k = 1; k < i ; k++) {
				if(k == 1) {
					System.out.print(k);
				}else {
					System.out.print("+" + k);
				}
			}
			System.out.println();
		}

	}

}
