package com.day19;

public class Unit {
	protected int x,y;
	public Unit(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("각 유닛이 이동하는 메서드");
	}
	public void stop() {
		System.out.println("각 유닛이 현재 위치에 정지");
	}
}

class Marine extends Unit{
	
	public Marine(int x, int y) {
		super(x, y);
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("보병이 " + x + ", " + y + "위치로 이동한다.");
	}
	
	public void stimpack() {
		System.out.println("스팀팩을 사용한다.");
	}
}

class Tank extends Unit{

	public Tank(int x, int y) {
		super(x, y);
	}
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("탱크가 " + x + ", " + y + "위치로 이동한다.");
	}
	public void changeMode() {
		System.out.println("공격모드를 변환한다.");
	}
	
}

class Dropship extends Unit{

	public Dropship(int x, int y) {
		super(x, y);
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("수송선의 위치를 " + x + ", " + y + "로 이동한다.");
	}
	public void load() {
		System.out.println("선택된 대상을 태운다.");
	}
	public void unLoad() {
		System.out.println("선택된 대상을 내린다.");
	}
	
}
