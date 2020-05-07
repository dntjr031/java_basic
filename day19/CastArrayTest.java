package com.day19;

public class CastArrayTest {
	
	public static void find(Car c) {
		
		if(c instanceof FireEngine) {
			FireEngine f = (FireEngine)c;
			f.drive();
			f.water();
		}else if(c instanceof Ambulance) {
			Ambulance a = (Ambulance)c;
			a.drive();
			a.siren();
		}
	}

	public static void main(String[] args) {
		
		Car[] c = new Car[3];
		c[0] = new FireEngine();
		c[1] = new Ambulance();
		c[2] = new FireEngine();
		//오버라이딩 메서드 호출
		for (int i = 0; i < c.length; i++) {
			c[i].drive();
		}
		System.out.println();
		
		//자식만의 메서드 호출
		for (int i = 0; i < c.length; i++) {
			find(c[i]);
		}
		System.out.println("\n");
		//확장 for이용
		for(Car car : c) {
			find(car);
		}
		
	}

}
