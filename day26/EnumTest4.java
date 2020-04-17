package com.day26;

public class EnumTest4 {

	public static void main(String[] args) {
		OverTimeValues over = OverTimeValues.FIVE_HOUR;
		System.out.println("5시간 야근 : " + over+ ", 야근수당 : " + over.getAmount() + "원");
		
		System.out.println("휴일 8시간 근무 : " + OverTimeValues.WEEKEND_EIGT_HOUR + ", 휴일 근무 수당 : "
							+ OverTimeValues.WEEKEND_EIGT_HOUR.getAmount() + "원");
		
		
	}

}

enum OverTimeValues{
	THREE_HOUR(18000),
	FIVE_HOUR(30000),
	WEEKEND_FOUR_HOUR(40000),
	WEEKEND_EIGT_HOUR(60000);

	private final int amount;
	
	private OverTimeValues(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}	
}