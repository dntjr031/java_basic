package com.day7;

public class WhileTest2 {

	public static void main(String[] args) {
		/*
		 * 	for(�ʱ��;���ǽ�;������){
		 * 		�ݺ����;
		 * 	}
		 * 
		 * 	�ʱ��;
		 * 	while(���ǽ�){
		 * 		�ݺ����;
		 * 
		 * 		������;
		 * 	}
		 * 
		 */
		
		for(int i = 0; i < 3; i++) {
			System.out.println("for �̿� : i=" + i);
		}
		
		System.out.println();
		
		int k = 0; // �ʱ��
		while(k < 3) { //���ǽ�
			System.out.println("[while �̿�] k=" + k);
			
			k++; //������
		}
		

	}

}
