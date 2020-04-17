package com.day20;

public class UnitTest {

	public static void main(String[] args) {
		Unit[] u = new Unit[4];
		u[0] = new Marine(10, 20);
		u[1] = new Tank(30, 50);
		u[2] = new Dropship(20, 100);
		u[3] = new Marine(30, 50);
		
		for(Unit un : u) {
			un.move(100, 200);
		}

	}

}
