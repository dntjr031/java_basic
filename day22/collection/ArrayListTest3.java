package com.day22.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// 규칙이 있는 경우 for문에서 초기화
		ArrayList<Integer> list = new ArrayList<Integer>(4);
		
		//저장
		for (int i = 0; i < 3; i++) {
			list.add((i + 1) * 2);
		}
		//읽어오기
		for (int i = 0; i < list.size(); i++) {
			int n = list.get(i);
			System.out.println(n);
		}
		System.out.println("\n=====확장 for 이용=====");
		
		for(int n : list) {
			System.out.print(n + "\t");
		}
		
		System.out.println("\n\n=====String=====");
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list2 = new ArrayList<String>(4);
		
		for (int i = 0; i < 2; i++) {
			System.out.println("이름을 입력하세요");
			String name = sc.nextLine();
			list2.add(name);
		}
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		sc.close();
	}

}
