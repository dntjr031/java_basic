package com.day11;

import java.util.*;

public class Lotto2 {
	
public static int[] lotto() {
		
		int[] lotto = new int[6];

		for(int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			
			for(int n = 0; n < i; n++) {
				if(lotto[i] == lotto[n]){
					i--; 
					break;
				}
			}
			
		}
		Arrays.sort(lotto);
		
		return lotto;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int[] arr = lotto();
			
			for(int n : arr) {
				System.out.print(n + " ");
			}
			System.out.println("\n\n계속 하시겠습니까? (y/n)");
			
			String str = sc.nextLine();
			if(str.equalsIgnoreCase("n")) break;
		}
		
		sc.close();

	}

}
