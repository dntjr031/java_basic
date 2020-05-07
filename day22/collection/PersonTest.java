package com.day22.collection;

import java.util.ArrayList;

public class PersonTest {

	public static void main(String[] args) {
		Person[] p = new Person[3];
		p[0] = new Person("홍길동", 20);
		p[1] = new Person("김길동", 30);
		p[2] = new Person("박길동", 40);
		
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
			p[i].showInfo();
			System.out.println();
		}

		System.out.println("\n\nArrayList 이용");
		ArrayList<Person> pArr = new ArrayList<Person>();
		pArr.add(new Person("김철수", 15));
		pArr.add(new Person("이철수", 25));
		pArr.add(new Person("최철수", 35));
		
		for(Person pe : pArr) {
			System.out.println(pe);
			pe.showInfo();
			System.out.println();
		}
	}

}
