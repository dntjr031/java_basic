package com.day17;

public class FinalTest1 {

	public static void main(String[] args) {
		

	}

}
/*
 final - ��������, ������ �� ����
 
 1) final Ŭ���� - �θ� Ŭ������ �� �� ����
 2) final �޼��� - �������̵��� �� ����
 3) final ������� - ���� ������ �� ����
 	final �������� - ���� ������ �� ����
 */
final class Parent3{
	public void func() {
		System.out.println("Parent");
	}
}

//class Child extends Parent3{} // error => Parent�� final class, �θ�Ŭ������ �� �� ����.
	
