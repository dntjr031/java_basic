package com.day22.collection;

import java.util.ArrayList;

public class PersonTest {

	public static void main(String[] args) {
		Person[] p = new Person[3];
		p[0] = new Person("ȫ�浿", 20);
		p[1] = new Person("��浿", 30);
		p[2] = new Person("�ڱ浿", 40);
		
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
			p[i].showInfo();
			System.out.println();
		}

		System.out.println("\n\nArrayList �̿�");
		ArrayList<Person> pArr = new ArrayList<Person>();
		pArr.add(new Person("��ö��", 15));
		pArr.add(new Person("��ö��", 25));
		pArr.add(new Person("��ö��", 35));
		
		for(Person pe : pArr) {
			System.out.println(pe);
			pe.showInfo();
			System.out.println();
		}
	}

}
