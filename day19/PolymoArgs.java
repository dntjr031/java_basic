package com.day19;

public class PolymoArgs {
	/*
	public static void register(Student st) {
		System.out.println(st.kind() + "�� ����� �մϴ�.");
	}
	public static void register(Graduate gr) {
		System.out.println(gr.kind() + "�� ����� �մϴ�.");
	}
	public static void register(Assitant as) {
		System.out.println(as.kind() + "�� ����� �մϴ�.");
	}
	*/
	public static void register(Person p) {
		if(p instanceof Student || p instanceof Assitant) {
			System.out.println(p.kind() + "�� ����� �մϴ�.");
		}else{
			System.out.println("����� �� �� �����ϴ�.");
		}
		
	}
	
	public static void main(String[] args) {
		Person[] p = new Person[4];
		p[0] = new Student();
		p[1] = new Graduate();
		p[2] = new Assitant();
		p[3] = new Professor();
		
		for(Person per : p) {
			register(per);
		}

	}

}

class Person{
	public String kind() {
		return "���";
	}
}

class Student extends Person{
	public String kind() {
		return "�л�";
	}
}

class Graduate extends Student{
	public String kind() {
		return "���п���";
	}
}

class Assitant extends Person{
	public String kind() {
		return "����";
	}
}

class Professor extends Person{
	public String kind() {
		return "����";
	}
}