package com.day25;

public class EqualsTset3 {

	public static void main(String[] args) {
		Test2 v1 = new Test2(10);
		Test2 v2 = new Test2(10);
		
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
		
	}

}

class Test2{
	private int value;
	Test2(int value){
		this.value = value;
	}
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Test2) {
			return ((Test2)obj).value == value;
		}else {
			return false;
		}
	}
	
	
}