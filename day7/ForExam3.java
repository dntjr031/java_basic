package com.day7;

public class ForExam3 {

	public static void main(String[] args) {
		
		System.out.println("7�� ����̰ų� 9�� ���");
		int count = 1;
		for(int i = 1; i < 100; i++) {
			
			if(i % 7 == 0 || i % 9 == 0) {
				
				if(count < 10) {
					System.out.print(i + "\t");
					count++;
				}else {
					System.out.print(i + "\n");
					count = 1;
				}
			}
		}//for
		
		System.out.println("\n\n ���η� 5������");
		count = 0;
		for(int i = 1; i < 100; i++) {
			
			if(i % 7 == 0 || i % 9 == 0) {
				System.out.print(i + "\t");
				//count++;
				if(++count % 5 == 0) {
					System.out.print("\n");
					
				} // ����if
					
			} //�ٱ�if
			
		}//for

	}

}
