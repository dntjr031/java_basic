package com.test2;

import com.test1.Parent;

public class Child extends Parent {
	
	public Child(){
		name = "자식";
		age = 20;
		addr = "서초동";
		//nickName = "별명"; // private
		//number = 1; // default
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
		System.out.println("주소: " + addr + "\n");
	}
}
