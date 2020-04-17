package com.day26;

public class EnumTest4 {

	public static void main(String[] args) {
		OverTimeValues over = OverTimeValues.FIVE_HOUR;
		System.out.println("5�ð� �߱� : " + over+ ", �߱ټ��� : " + over.getAmount() + "��");
		
		System.out.println("���� 8�ð� �ٹ� : " + OverTimeValues.WEEKEND_EIGT_HOUR + ", ���� �ٹ� ���� : "
							+ OverTimeValues.WEEKEND_EIGT_HOUR.getAmount() + "��");
		
		
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