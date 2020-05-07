package com.day7;

public class ForDup1 {

	public static void main(String[] args) {

		//중첩for
		/*
		 * - for문 안에 for문이 들어간  것
		 * 
		 * 	for(초기식;조건식;증감식){
		 * 		for(초기식;조건식;증감식){
		 * 			처리할 문장
		 * 		}// 안쪽 for
		 * }// 바깥 for
		 * 
		 * => 바쁜 for가 안쪽for
		 */
		
		for(int i =0; i < 3; i ++) {
			System.out.println("==========현재 i : " + i);
			
			for(int j = 0; j < 2; j++) {
				System.out.println("현재 f : " + j);
			}// end of inside for
			
			System.out.println();
		}// end of outside for
		
		/*
		 *  =====i : 0
		 *  j -> 0
		 *  j -> 1
		 *  =====i : 1
		 *  j -> 0
		 *  j -> 1
		 *  =====i : 2
		 *  j -> 0
		 *  j -> 1
		 */

	}

}
