package com.day18;

public class Employee {
	protected final String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}  
	
	public int findPay() {
		return 0;
	}
}

class Permanent extends Employee{
	private final int SALARY;
	private int bonus;
	
	public Permanent(String name, int sALARY, int bonus) {
		super(name);
		SALARY = sALARY;
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getSALARY() {
		return SALARY;
	}

	public int findPay() {
		return SALARY + bonus;
		
	}
	
}

class Temporary extends Employee{
	private int time, pay;

	public Temporary(String name, int time, int pay) {
		super(name);
		this.time = time;
		this.pay = pay;
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

	
	public int findPay() {
		return time * pay;
	
	}
	
}
