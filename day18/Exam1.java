package com.day18;

public class Exam1 {

	public static void main(String[] args) {
		Triangle[] t = new Triangle[3];
		t[0] = new Triangle();
		t[1] = new Triangle();
		t[2] = new Triangle();
		for (int i = 0; i < t.length; i++) {
			System.out.println("t[" + i + "]");
			t[i].draw();
			t[i].delete();
			System.out.println();
		}
		
		
		//Shape[] sh = new Shape[3];
		

	}

}
