package com.day20;

public class FightTest {

	public static void main(String[] args) {

		Fighter f = new Fighter(20, 50, 100);
		f.move(40, 50);
		f.attack(new Fighter(40,50,120));
		
		new Fighter(30,70,100).attack(f);
		
		//�ڽ��� �θ��� �ν��Ͻ��̱⵵ �ϴ�
		if(f instanceof Unit2) {
			System.out.println("f�� Unit2�� �ν��Ͻ��̱⵵ �ϴ�");
		}
		if(f instanceof Fightable) {
			System.out.println("f�� Fightable�� �ν��Ͻ��̱⵵ �ϴ�");
		}
		if(f instanceof Attackable) {
			System.out.println("f�� Attackable�� �ν��Ͻ��̱⵵ �ϴ�");
		}
		if(f instanceof Movable) {
			System.out.println("f�� Movable�� �ν��Ͻ��̱⵵ �ϴ�");
		}
		if(f instanceof Object) {
			System.out.println("f�� Object�� �ν��Ͻ��̱⵵ �ϴ�");
		}
	}

}

interface Attackable{
	void attack(Unit2 unit2);
}

interface Movable{
	void move(int x, int y);
}
// �������̽������� extends Ű���带 �̿��Ͽ� ���� ��Ӱ���(���߻�� ����)
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
		System.out.println("���δ�");
	}
	public void move(int x, int y) {
		System.out.println("x=" + x + ", y=" + y + "�� ��ġ�� �̵��Ѵ�.");
	}

	public void attack(Unit2 unit2) {
		System.out.println("x=" + unit2.x + ", y=" + unit2.y + "�� ��ġ�� �ְ�, ü���� " 
						+ unit2.currentHP + "�� ������ �����Ѵ�.");
		
	}
	
	
}