package com.day15;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("[1]===================");
		Student st = new Student("È«±æµ¿", 2012001);
		st.info();
		
		System.out.println("\n[2]==================");
		Student[] stu = new Student[3];
		stu[0] = new Student("±è¿¬¾Æ", 2012002);
		stu[1] = new Student("À¯Àç¼®", 2012003);
		stu[2] = new Student("±èÀ¯Á¤", 2012004);
		
		for (int i = 0; i < stu.length; i++) {
			stu[i].info();
		}

	}

}
