package com.day18;

public class UnitTest2 {

	public static void main(String[] args) {
		Unit un = new Marine(10, 20);
		un.move(40, 50);
		
		System.out.println();
		
		Unit[] u = new Unit[5];
		u[0] = new Marine(100, 200);
		u[1] = new Tank(100,200);
		u[2] = new Dropship(100,200);
		u[3] = new Marine(100,200);
		u[4] = new Tank(100,200);
		
		for (int i = 0; i < u.length; i++) {
			u[i].move(400, 30);
		}

	}

}
