package com.day15;

class AAA{
	static int[] arr = new int[10]; //����� �ʱ�ȭ
	
	/*
	static �ʱ�ȭ �� - static������ ������ �ʱ�ȭ�� ����
	 static{
	 
	 }
	 */
	static {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}// for
	}
	/*
	 ����� �ʱ���ϸ� ���� �迭 arr�� ����
	 static �ʱ�ȭ ���� �̿��ؼ� �迭�� �� ��ҵ��� ������ ������ ä����.
	 */
}//class


public class StaticBlockTest {

	public static void main(String[] args) {
		
		System.out.println("===AAA Ŭ������ arr�迭 ���===");
		
		for (int i = 0; i < AAA.arr.length; i++) {
			System.out.print(AAA.arr[i] + " ");
		}//for
		
	}

}
