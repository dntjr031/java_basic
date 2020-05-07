package com.day19;

public class UnitTest2 {

	public static void main(String[] args) {
		Unit[] u = new Unit[4];
		u[0] = new Marine(11, 20);
		u[1] = new Tank(11, 20);
		u[2] = new Dropship(11, 20);
		u[3] = new Marine(11, 20);
		
		// 오버라이딩 메서드 호출
		for(Unit un : u) {
			un.move(30, 100);
		}
		System.out.println();
		for (int i = 0; i < u.length; i++) {
			u[i].move(20, 50);
		}
		System.out.println("\n<<자식만의 메서드>>");
		//자식만의 메서드 호출
		for(Unit un : u) {
			if(un instanceof Marine) {
				((Marine) un).stimpack();
			}else if(un instanceof Tank) {
				((Tank) un).changeMode();
			}else if(un instanceof Dropship) {
				((Dropship) un).unLoad();
				((Dropship) un).load();
			}
		}
		System.out.println();
		for (int i = 0; i < u.length; i++) {
			if(u[i] instanceof Marine) {
				((Marine) u[i]).stimpack();
			}else if(u[i] instanceof Tank) {
				((Tank) u[i]).changeMode();
			}else if(u[i] instanceof Dropship) {
				((Dropship) u[i]).unLoad();
				((Dropship) u[i]).load();
			}
		}
		

	}

}
