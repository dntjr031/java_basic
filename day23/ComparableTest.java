package com.day23;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		TreeSet<Person> tset = new TreeSet<Person>();
		tset.add(new Person("ȫ�浿", 20));// ClassCastException => Person cannot be cast to java.lang.Comparable
		tset.add(new Person("�迬��", 17));// Person�� Comparable�� �������Ѿ� ��
		tset.add(new Person("�տ���", 31));// compareTo()�� �������̵� �����ν� ���� �������� ����
		
		Iterator<Person> ir = tset.iterator();
		while(ir.hasNext()) {
			Person p = ir.next();
			System.out.println(p);
		}

		/*
		 Person �ν��Ͻ��� ũ�� ������ ���� �� �ְ� ��
		 TreeSet<E>�� Person�ν��Ͻ��� ����� ������
		 ������ ����� �ν��Ͻ����� �񱳸� ���ؼ� compareTo()�޼��带 ����� ȣ���Ͽ�,
		 �̶� ��ȯ�Ǵ� ���� ������� ������ �����Ѵ�.
		 
		 TreSet<E>�� ����Ǵ� �ν��Ͻ��� �ݵ�� Comparable<T>�������̽��� �����ϰ� �־�� ��
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