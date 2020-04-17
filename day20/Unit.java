package com.day20;

abstract public class Unit {
	int x, y;
	
	public Unit(int x, int y) {
		this.x = x;
		this.y = y;
	}

	abstract public void move(int x, int y);
	
	public void stop() {
		System.out.println("�� ������ ���� ��ġ�� ����");
	}
}

class Marine extends Unit{
	
	public Marine(int x, int y) {
		super(x, y);
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("������ " + x + ", " + y + "��ġ�� �̵��Ѵ�.");
	}
	
	public void stimpack() {
		System.out.println("�������� ����Ѵ�.");
	}
}

class Tank extends Unit{

	public Tank(int x, int y) {
		super(x, y);
	}
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("��ũ�� " + x + ", " + y + "��ġ�� �̵��Ѵ�.");
	}
	public void changeMode() {
		System.out.println("���ݸ�带 ��ȯ�Ѵ�.");
	}
	
}

class Dropship extends Unit{

	public Dropship(int x, int y) {
		super(x, y);
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("���ۼ��� ��ġ�� " + x + ", " + y + "�� �̵��Ѵ�.");
	}
	public void load() {
		System.out.println("���õ� ����� �¿��.");
	}
	public void unLoad() {
		System.out.println("���õ� ����� ������.");
	}
	
}