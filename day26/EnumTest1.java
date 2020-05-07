package com.day26;

enum Color{RED, GREEN, BLUE}

public class EnumTest1 {

	public static void main(String[] args) {
		Color c = Color.BLUE;
		System.out.println("c = " + c);
		System.out.println(c + "의 value : " + c.ordinal()+"\n");
		
		//Color[] colArr = Color.values();
		for(Color col : Color.values()) {
			System.out.println( col + "의 value = " + col.ordinal());
		}
		
		/*
		 열거된 순서에 따라 0부터 순서값을 가지며 정수형으로 교환하여 사용할 수 있다.
		 
		 열거형을 다루기 위한 기본적인 메소드
		 [1]values() : 열거된 모든 원소를 순서대로 반환하는 메소드
		 [2]ordinal() : 원소의 열거된 순서를 정수 값으로 반환하는 메소드
		 [3]valueOf() : 매개변수로 주어진 스트링과 열거형에서 일치하는 이름을 갖는 원소를 반환하는 메서드
		 (만약 주어진 스트링과 일치하는 원소가 없는 경우 예외발생)
		 */
		
		Color c2 = Color.valueOf("RED");
		System.out.println("\n\n" + c2);
		
		//Color c3 = c.valueOf("Red"); // 예외 IllegalArgumentException
		//System.out.println(c3);
	}

}
