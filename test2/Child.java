package com.test2;

import com.test1.Parent;

public class Child extends Parent {
	
	public Child(){
		name = "�ڽ�";
		age = 20;
		addr = "���ʵ�";
		//nickName = "����"; // private
		//number = 1; // default
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name + ", ���� : " + age);
		System.out.println("�ּ�: " + addr + "\n");
	}
}
