package com.day23;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Member> mArr = new ArrayList<Member>();
		mArr.add(new Member("홍길동", 20));
		mArr.add(new Member("김길동", 30));
		mArr.add(new Member("박길동", 40));
		
		for (int i = 0; i < mArr.size(); i++) {
			System.out.println(mArr.get(i));
		}
		
		System.out.println("\nIterator 이용");
		Iterator<Member> im = mArr.iterator();
		while(im.hasNext()) {
			System.out.println(im.next());
		}
		
		System.out.println("\nVector Test");
		Vector<Member> vArr = new Vector<Member>();
		vArr.add(new Member("김철수", 20));
		vArr.add(new Member("박철수", 25));
		vArr.add(new Member("최철수", 30));
		
		for (int i = 0; i < vArr.size(); i++) {
			vArr.get(i).showInfo();
		}
		
		System.out.println("\nEnumeration이용");
		Enumeration<Member> en = vArr.elements();
		while(en.hasMoreElements()) {
			en.nextElement().showInfo();
		}
	}

}

class Member{
	private String id;
	private int age;
	
	public Member(String id, int age) {
		this.id = id;
		this.age = age;
	}

	public String toString() {
		return "Member [id=" + id + ", age=" + age + "]";
	}
	
	public void showInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("나이 : " + age + "\n");
	}
}
