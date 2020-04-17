package com.day19;

import java.util.Scanner;

public class Employee {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name) {
		this.name = name;
	}
	
	public int findPay() {
		return 0;
	}
	public void showInfo() {
		
	}
}

class Permanent extends Employee{
	protected final int SALARY;

	public int getSALARY() {
		return SALARY;
	}

	public Permanent(String name, int sALARY) {
		super(name);
		SALARY = sALARY;
	}
	
	public int findPay() {
		return SALARY;
	}

	public void showInfo() {
		System.out.println("\n�������:�ӽ���");
		System.out.println("�̸�:" + name);
		System.out.println("�޿�:" + SALARY);
	}
	
}

class Temporary extends Employee{
	private int time, pay;

	public int findPay() {
		return time * pay;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public Temporary(String name, int time, int pay) {
		super(name);
		this.time = time;
		this.pay = pay;
	}

	public void showInfo() {
		System.out.println("\n�������:�ӽ���");
		System.out.println("�̸�:" + name);
		System.out.println("�޿�:" + findPay());
	}
	
}

class SalesPerson extends Permanent{
	private final double RATE = 0.15;
	
	private int earning;
	
	public SalesPerson(String name, int sALARY, int earning) {
		super(name, sALARY);
		this.earning = earning;
	}
	public int findPay() {
		
		return super.findPay() + (int)(earning*RATE);
	}
	public int getEarning() {
		return earning;
	}
	public void setEarning(int earning) {
		this.earning = earning;
	}
	public void showInfo() {
		System.out.println("\n�������:�Ǹ���");
		System.out.println("�̸�:" + name);
		System.out.println("�޿�:" + findPay());
	}
	
}

class EmployeeManager{
	static Scanner sc = new Scanner(System.in);
	
	public Permanent inputPermanent() {
		System.out.println("�̸�, �⺻�޿��� �Է��ϼ���");
		String name = sc.nextLine();
		int sALARY = sc.nextInt();
		sc.nextLine();
		Permanent p = new Permanent(name, sALARY);
		return p;
	}
	public Temporary inputTemporary() {
		System.out.println("�̸�, ���ѽð�, �ð���޿��� �Է��ϼ���");
		String name = sc.nextLine();
		int time = sc.nextInt();
		int pay = sc.nextInt();
		sc.nextLine();
		Temporary t = new Temporary(name, time, pay);
		return t;
	}
	public SalesPerson inputSalesPerson() {
		System.out.println("�̸�, �⺻�޿�, �Ǹż����� �Է��ϼ���");
		String name = sc.nextLine();
		int sALARY = sc.nextInt();
		int earning = sc.nextInt();
		SalesPerson s = new SalesPerson(name, sALARY, earning);
		return s;
	}
}