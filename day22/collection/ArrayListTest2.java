package com.day22.collection;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// generic �÷��� - �÷��ǿ� ������ ��ü�� Ÿ���� �����ϴ� ��
		ArrayList<Integer> list = new ArrayList<Integer>(3);
		
		System.out.println("list�� ����� ���� : " + list.size());
		
		//1. ������ ����
		list.add(1); // autoBoxing
		list.add(2);
		list.add(3);
		list.add(4);
		
		//2. ������ �б�
		for (int i = 0; i < list.size(); i++) {
			int n = list.get(i); // ����ȯ �ʿ� ����
			//=> unBoxing : ����� ���� �������� �⺻�� ������ ���� �ٷ� ��� ��
			
			System.out.println(n);
		}
		
		//3. ������ ����
		list.remove(1); // index�� 1�� ��� ����
		
		System.out.println("\n=====���� ��====");

		for (int n : list) {
			System.out.println(n + "\t");
		}
		
		System.out.println("���� �� ����:" + list.size());
	}

}
