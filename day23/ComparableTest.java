package com.day23;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		TreeSet<Person> tset = new TreeSet<Person>();
		tset.add(new Person("홍길동", 20));// ClassCastException => Person cannot be cast to java.lang.Comparable
		tset.add(new Person("김연아", 17));// Person에 Comparable을 구현시켜야 함
		tset.add(new Person("손연재", 31));// compareTo()를 오버라이딩 함으로써 나이 기준으로 정렬
		
		Iterator<Person> ir = tset.iterator();
		while(ir.hasNext()) {
			Person p = ir.next();
			System.out.println(p);
		}

		/*
		 Person 인스턴스의 크고 작음을 비교할 수 있게 됨
		 TreeSet<E>는 Person인스턴스가 저장될 때마다
		 기존에 저장된 인스턴스와의 비교를 위해서 compareTo()메서드를 빈번히 호출하여,
		 이때 반환되는 값을 기반으로 정렬을 진행한다.
		 
		 TreSet<E>에 저장되는 인스턴스는 반드시 Comparable<T>인터페이스를 구현하고 있어야 함
		 */
	}

}

class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public int compareTo(Person o) {
		if(this.age > o.age) return 1;
		else if(this.age == o.age) return 0;
		else return -1;
	}
	
}
