package com.day15;

public class AccountTest {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 3;
		arr[1] = 4;
		arr[2] = 5;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		String[] sArr = new String[4];
		sArr[0] = "ö��";
		sArr[1] = "����";
		sArr[2] = "�ͱ�";
		sArr[3] = "����";
		
		for(String n : sArr) {
			System.out.print(n + " ");
		}
		System.out.println();
		//��ü�� ���
		Account acc = new Account("100-01-1000", 100000);
		acc.deposit(50000);
		acc.showInfo();
		System.out.println("=====================\n");
		//�迭�� ���
		Account[] accArr = new Account[3];
		accArr[0] = new Account("100-01-2000", 100000);
		accArr[1] = new Account("100-01-3000", 200000);
		
		Account acc1 = new Account("100-01-4000", 300000);
		accArr[2] = acc1;
		
		for (int i = 0; i < accArr.length; i++) {
			accArr[i].withdraw(20000);
			accArr[i].showInfo();
		}
		
	}

}
