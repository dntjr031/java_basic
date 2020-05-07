package com.day15;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("[1]===================");
		Student st = new Student("홍길동", 2012001);
		st.info();
		
		System.out.println("\n[2]==================");
		Student[] stu = new Student[3];
		stu[0] = new Student("김연아", 2012002);
		stu[1] = new Student("유재석", 2012003);
		stu[2] = new Student("김유정", 2012004);
		
		for (int i = 0; i < stu.length; i++) {
			stu[i].info();
		}

	}

}
