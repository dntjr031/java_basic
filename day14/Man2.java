package com.day14;

public class Man2 {

	private int age;
	
	
	// getter, setter
	public int getAge() { //�о����
		return age;
	}
	
	public void setAge(int age) { // ����
		if(age < 0 || age >= 200) { //�߸����� ���� ���� �� �ִ�.
			this.age = 0;
			System.out.println("\n��ȿ���� ���� �����Դϴ�!");
			return;
		}
		
		this.age = age;
	}
	
}
