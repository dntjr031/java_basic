package com.day14;

public class Man2 {

	private int age;
	
	
	// getter, setter
	public int getAge() { //읽어오기
		return age;
	}
	
	public void setAge(int age) { // 쓰기
		if(age < 0 || age >= 200) { //잘못들어온 값을 막을 수 있다.
			this.age = 0;
			System.out.println("\n유효하지 않은 나이입니다!");
			return;
		}
		
		this.age = age;
	}
	
}
