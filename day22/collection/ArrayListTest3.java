package com.day22.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// ��Ģ�� �ִ� ��� for������ �ʱ�ȭ
		ArrayList<Integer> list = new ArrayList<Integer>(4);
		
		//����
		for (int i = 0; i < 3; i++) {
			list.add((i + 1) * 2);
		}
		//�о����
		for (int i = 0; i < list.size(); i++) {
			int n = list.get(i);
			System.out.println(n);
		}
		System.out.println("\n=====Ȯ�� for �̿�=====");
		
		for(int n : list) {
			System.out.print(n + "\t");
		}
		
		System.out.println("\n\n=====String=====");
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list2 = new ArrayList<String>(4);
		
		for (int i = 0; i < 2; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			String name = sc.nextLine();
			list2.add(name);
		}
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		sc.close();
	}

}
