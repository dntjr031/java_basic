package com.day22.collection;

import java.util.ArrayList;

public class PersonTest {

	public static void main(String[] args) {
		Person[] p = new Person[3];
		p[0] = new Person("È«±æµ¿", 20);
		p[1] = new Person("±è±æµ¿", 30);
		p[2] = new Person("¹Ú±æµ¿", 40);
		
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
			p[i].showInfo();
			System.out.println();
		}

		System.out.println("\n\nArrayList ÀÌ¿ë");
		ArrayList<Person> pArr = new ArrayList<Person>();
		pArr.add(new Person("±èÃ¶¼ö", 15));
		pArr.add(new Person("ÀÌÃ¶¼ö", 25));
		pArr.add(new Person("ÃÖÃ¶¼ö", 35));
		
		for(Person pe : pArr) {
			System.out.println(pe);
			pe.showInfo();
			System.out.println();
		}
	}

}
