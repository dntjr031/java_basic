package com.day8;

public class ContinueTest2 {

	public static void main(String[] args) {
		
		System.out.println("\n======break 이용========");
		
		for(int i = 0; i <3; i++) {
			for(int j =0; j < 3; j++) {
				if(j == 1) break;
				
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		
		System.out.println("\n======continue 이용========");
		
		for(int i = 0; i <3; i++) {
			for(int j =0; j < 3; j++) {
				if(j == 1) continue;
				
				System.out.println("i=" + i + ", j=" + j);
			}
		}

	}

}
