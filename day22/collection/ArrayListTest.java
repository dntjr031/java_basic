package com.day22.collection;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		/*
		 �÷��� �����ӿ�ũ
		 - ������ �׷��� �����ϴ� Ŭ�������� ǥ��ȭ�� ����
		 - �޸� ũ�⸦ �������� Ȯ���� �� �ִ�.
		 - ����, �˻�, ���� ���� �޼��� ����
		 
		 �÷��� �������̽� 3����
		 [1] List
		 	- ������ �����ǰ� �ߺ��� ���
		 	���� Ŭ���� - ArrayList, Vector ��
		 [2] Set
		 	- ������ �������� �ʰ� �ߺ��� ������ �ʴ´�
		 	���� Ŭ���� - HashSet
		 [3] Map
		 	- Ű, ��(Key, value)������ ����Ǵ� ������ ����
		 	- ������ �����ǰ�, Ű�� �ߺ������� �ȵ����� ���� ����
		 	���� Ŭ���� - HashMap, Hashtable, Properties
		 */
		
		// 1. ����
		ArrayList<Integer> list = new ArrayList<Integer>(3);
		list.add(new Integer(10));
		// add(Object obj) <= �Ű������� Object�� �ڽİ�ü�� �־��ش�.
		list.add(new Integer(20)); // boxing - �⺻���� �������� WrapperŬ������ ��ȯ�ϴ� ��
		list.add(35); // jdk5.0 ���ʹ� �⺻�ڷ����� ���� �� �ְ� ��
		//=> AutoBoxing : �ڵ����� �⺻���� ���������� ��ȯ����
		
		//2. �˻�(������ �о����)
		for (int i = 0; i < list.size(); i++) {
			Object o = list.get(i);
			Integer n = (Integer)o; // downcasting
			int k = n.intValue(); //public int intValue() / Returns the value of this Integer as an int.
			// UnBoxing
			System.out.println(i + "��° ��� : " + k);
		}
		
		System.out.println("\nlist�� ���� ������ ����" + list.size());
		/*
		list.add(new Double(3.14));
		list.add(4.56f);
		list.add("java"); //=> ��� �ڷ����� ������ �� �ִ�.
		
		Double d = (double)list.get(3);
		System.out.println("3��° ��� : " + d);
		
		String s = (String)list.get(5); 
		System.out.println("5��° ��� : " + s);
		
		//������ ����
		list.remove(3);
		Float f = (Float)list.get(3);
		System.out.println("���� �� 3��° ���� : " + f);
		*/
	}

}
