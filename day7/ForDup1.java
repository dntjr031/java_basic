package com.day7;

public class ForDup1 {

	public static void main(String[] args) {

		//��øfor
		/*
		 * - for�� �ȿ� for���� ��  ��
		 * 
		 * 	for(�ʱ��;���ǽ�;������){
		 * 		for(�ʱ��;���ǽ�;������){
		 * 			ó���� ����
		 * 		}// ���� for
		 * }// �ٱ� for
		 * 
		 * => �ٻ� for�� ����for
		 */
		
		for(int i =0; i < 3; i ++) {
			System.out.println("==========���� i : " + i);
			
			for(int j = 0; j < 2; j++) {
				System.out.println("���� f : " + j);
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
