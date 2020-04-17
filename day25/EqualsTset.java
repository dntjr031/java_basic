package com.day25;

public class EqualsTset {

	public static void main(String[] args) {
		Test v1 = new Test(10);
		Test v2 = new Test(10);
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같다");
		}else {
			System.out.println("v1과 v2는 다르다");
		}
		
		if(v1 == v2) {
			System.out.println("v1과 v2는 같다");
		}else {
			System.out.println("v1과 v2는 다르다");
		}
		
		v2 = v1;
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같다");
		}else {
			System.out.println("v1과 v2는 다르다");
		}
		/*
		 연산자 ==
		 [1] 기본형에서 값 비교
		 [2] 참조형에서 주소 비교
		 
		 String의 equals() 메서드 - 문자열의 값 비교
		 						- Object의 equals()를 오버라이딩 한 것
		 Object의 equals() 메서드 - 주소비교
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