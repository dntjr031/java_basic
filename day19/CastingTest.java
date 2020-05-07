package com.day19;

public class CastingTest {

	public static void main(String[] args) {
		//기본형처럼 참조형 변수에서도 형변환이 가능함
		//=> 단, 상속관계의 클래스 사이에서만 가능
		
		//[1] 참조형 변수의 자동 형변환 = > 다형성
		//부모타임 <- 자식
		//Up-casting
		Car c = new FireEngine(); //자동 형변환
		c.drive();
		//c.water(); => error, 자식만의 메서드 호출 불가
		
		//[2] 참조형 변수의 명시적 형변환
		//자식타입 <- 부모
		//=> Down-casting
		FireEngine f = (FireEngine)c; // 명시적 형변환, 부모 참조변수를 자식 타입에 대입
		f.drive();
		f.water(); //다운 캐스팅으로 자식만의 메서드도 호출 가능해짐
		
		((FireEngine)c).water();
		
		//FireEngine f = (FireEngine)new Car(); => 컴파일은 되지만 런타임 에러( ClassCastException )
		
		c= new Ambulance();
		Ambulance am = (Ambulance)c;
		am.drive();
		am.siren();
		
		/*
		 instanceof 연산자
		 - 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 사용
		 
		 참조변수 instanceof 타입(클래스)
		 => 참조변수가 해당타입의 인스턴스면 true, 아니면 false를 리턴
		 => 조건문에서 사용
		 예) c instanceof FireEngine
		 => 참조변수 c가 FireEngine의 인스턴스인지 체크
		 */
		boolean bool = c instanceof FireEngine;
		System.out.println("참조변수 c의 실제 인스턴스가 FireEngine인가? " + bool);
		System.out.println("참조변수 c의 실제 인스턴스가 Ambulance인가? " + (c instanceof Ambulance));
		
		if(c instanceof FireEngine) {
			FireEngine f2 = (FireEngine)c;
			f2.water();
		}else if(c instanceof Ambulance) {
			Ambulance a2 = (Ambulance)c;
			a2.siren();
		}
		/*
		 자식 instanceof 부모클래스
		 => true
		 자식은 부모의 인스턴스이기도 하다
		 */
		FireEngine f3 = new FireEngine();
		if(f3 instanceof Object) {
			System.out.println("f3은 Objaect의 인스턴스이기도 하다");
		}
		if(f3 instanceof Car) {
			System.out.println("f3은 Car의 인스턴스이기도 하다");
		}
		if(f3 instanceof FireEngine) {
			System.out.println("f3은 FireEngine의 인스턴스이다");
		}
	}

}

class Car{
	
	void drive() {
		System.out.println("차를 운전하는 메서드");
	}
	void stop() {
		System.out.println("차를 멈춥니다");
	}
	
}

class FireEngine extends Car{
	void drive() {
		System.out.println("소방차를 운전합니다");
	}
	void water() {
		System.out.println("water!");
	}
}

class Ambulance extends Car{
	void drive() {
		System.out.println("엠뷸런스를 운전합니다");
	}
	void siren() {
		System.out.println("siren!");
	}
}
