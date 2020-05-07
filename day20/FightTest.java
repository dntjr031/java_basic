package com.day20;

public class FightTest {

	public static void main(String[] args) {

		Fighter f = new Fighter(20, 50, 100);
		f.move(40, 50);
		f.attack(new Fighter(40,50,120));
		
		new Fighter(30,70,100).attack(f);
		
		//자식은 부모의 인스턴스이기도 하다
		if(f instanceof Unit2) {
			System.out.println("f는 Unit2의 인스턴스이기도 하다");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable의 인스턴스이기도 하다");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable의 인스턴스이기도 하다");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Movable의 인스턴스이기도 하다");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object의 인스턴스이기도 하다");
		}
	}

}

interface Attackable{
	void attack(Unit2 unit2);
}

interface Movable{
	void move(int x, int y);
}
// 인터페이스끼리는 extends 키워드를 이용하여 서로 상속가능(다중상속 가능)
interface Fightable extends Attackable, Movable{
	
}

abstract class Unit2{
	protected int x,y, currentHP;
	
	public Unit2(int x, int y, int currentHP) {
		this.x = x;
		this.y = y;
		this.currentHP = currentHP;
	}
}

class Fighter extends Unit2 implements Fightable{

	public Fighter(int x, int y, int currentHP) {
		super(x, y, currentHP);
	}

	public void kill() {
		System.out.println("죽인다");
	}
	public void move(int x, int y) {
		System.out.println("x=" + x + ", y=" + y + "인 위치로 이동한다.");
	}

	public void attack(Unit2 unit2) {
		System.out.println("x=" + unit2.x + ", y=" + unit2.y + "인 위치이 있고, 체력이 " 
						+ unit2.currentHP + "인 유닛을 공격한다.");
		
	}
	
	
}
