package com.day7;

public class WhileTest2 {

	public static void main(String[] args) {
		/*
		 * 	for(초기식;조건식;증감식){
		 * 		반복명령;
		 * 	}
		 * 
		 * 	초기식;
		 * 	while(조건식){
		 * 		반복명력;
		 * 
		 * 		증감식;
		 * 	}
		 * 
		 */
		
		for(int i = 0; i < 3; i++) {
			System.out.println("for 이용 : i=" + i);
		}
		
		System.out.println();
		
		int k = 0; // 초기식
		while(k < 3) { //조건식
			System.out.println("[while 이용] k=" + k);
			
			k++; //증감식
		}
		

	}

}
