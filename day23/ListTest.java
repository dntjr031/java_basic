package com.day23;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Member> mArr = new ArrayList<Member>();
		mArr.add(new Member("È«±æµ¿", 20));
		mArr.add(new Member("±è±æµ¿", 30));
		mArr.add(new Member("¹Ú±æµ¿", 40));
		
		for (int i = 0; i < mArr.size(); i++) {
			System.out.println(mArr.get(i));
		}
		
		System.out.println("\nIterator ÀÌ¿ë");
		Iterator<Member> im = mArr.iterator();
		while(im.hasNext()) {
			System.out.println(im.next());
		}
		
		System.out.println("\nVector Test");
		Vector<Member> vArr = new Vector<Member>();
		vArr.add(new Member("±èÃ¶¼ö", 20));
		vArr.add(new Member("¹ÚÃ¶¼ö", 25));
		vArr.add(new Member("ÃÖÃ¶¼ö", 30));
		
		for (int i = 0; i < vArr.size(); i++) {
			vArr.get(i).showInfo();
		}
		
		System.out.println("\nEnumerationÀÌ¿ë");
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
		System.out.println("¾ÆÀÌµð : " + id);
		System.out.println("³ªÀÌ : " + age + "\n");
	}
}