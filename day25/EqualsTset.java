package com.day25;

public class EqualsTset {

	public static void main(String[] args) {
		Test v1 = new Test(10);
		Test v2 = new Test(10);
		if(v1.equals(v2)) {
			System.out.println("v1�� v2�� ����");
		}else {
			System.out.println("v1�� v2�� �ٸ���");
		}
		
		if(v1 == v2) {
			System.out.println("v1�� v2�� ����");
		}else {
			System.out.println("v1�� v2�� �ٸ���");
		}
		
		v2 = v1;
		if(v1.equals(v2)) {
			System.out.println("v1�� v2�� ����");
		}else {
			System.out.println("v1�� v2�� �ٸ���");
		}
		/*
		 ������ ==
		 [1] �⺻������ �� ��
		 [2] ���������� �ּ� ��
		 
		 String�� equals() �޼��� - ���ڿ��� �� ��
		 						- Object�� equals()�� �������̵� �� ��
		 Object�� equals() �޼��� - �ּҺ�
		 */
	}

}

class Test{
	private int value;
	Test(int value){
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}