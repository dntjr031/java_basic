package com.day6;

public class ForTest1 {

	public static void main(String[] args) {

		/*
		�ݺ��� - �ݺ����� �۾��� ������ �� ���
		1) for - �ݺ� Ƚ���� ������ ���
		2) while
		3) do ~ while
		4) Ȯ�� for 
		
		   (���۰�;������;������)
		for(�ʱ��;���ǽ�;������){
			�ݺ��� ���;
		}
		*/
		
		for(int i = 0; i < 3; i++) { // i : 1,2,3 => 3�� �ݺ�
			System.out.println("Hello java!");	
		}//for
		
		for(int i = 0; i < 4; i++) { //4�� �ݺ�
			System.out.println("i=" + i);
		} //for
		
		for(int i = 3; i > 0; i--) { // i : 3,2,1 => 3�� �ݺ�			
			System.out.println(i);
		} //for
		
		/*
		 1. jsp
		 2. jsp
		 3. jsp
		 4. jsp
		 5. jsp
		 */
		
		for(int i = 0; i < 5; i++) {
			System.out.println(++i + ". jsp");
			--i;
		}//end of for
		
		System.out.println("==================");
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". jsp");		
		}//end of for
		
		System.out.println("==================");
		
		for(int i = 2; i < 10; i++) {
			
			if((i % 2) == 0) {
			System.out.println(i + ". jsp");
			}
		}//end of for	
		
		System.out.println("==================");
		
		for(int i = 2; i < 10; i += 2) {
			System.out.println(i + ". jsp");
		}//end of for
		// 1�� ���� : i++ => i = i + 1 => i += 1
		// 2�� ���� : i = i + 2 => i += 2
		
		System.out.println("==================");
		
		/*
		 *  1 3 5 7 9 11
		 */
		for(int i = 1; i < 12; i += 2) {
			System.out.print(i + " ");
		}//end of for
		
		System.out.println("\n==================");
		
		for(int i = 10; i > -8; i -= 2) {
			if(i > 0) {
				System.out.println(i + " java");
			}else if(i < 0) {
				System.out.println(i + " spring");
			}else {
				System.out.println(i + " oracle");
			}//end of if
		} //end of for
		
	}// end of main

}// end of class
