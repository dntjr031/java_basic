package com.day24;


import java.util.Scanner;

public class RandomExam {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("짝수 입력");
			int n = sc.nextInt();
			int[] arr = new int[n];
			sc.nextLine();
			
			for (int i = 0; i < arr.length; i++) {
				int rnd = (int)(Math.random()*(n/2));
				int count = 0;
				
				if(i>1) {
					for (int j = 0; j < i; j++) {
						if(arr[j] == rnd) {
							count++;
						}
					}
					if(count == 2) {
						i--;
						continue;
					}else {
						arr[i] = rnd;
					}
				}else{
					arr[i] = rnd;
				}
			}
			
			for(int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println("Quit?(Y/N)");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("y")) {
				continue;
			}else {
				System.out.println("종료");
				return;
			}
		}
	}
}
