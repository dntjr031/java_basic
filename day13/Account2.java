package com.day13;

public class Account2 {
	
	String accId, name;
	int balance;
	
	//2. ������
	//=> ��ü�� �����ϸ� �ڵ����� ȣ��Ǿ� ���� ���� ����Ǵ� �޼���
	//=> ������� �ʱ�ȭ�� �������� ���Ǵ� �޼���
	//Ŭ������� �����ϰ�, �Ű������� ���� �� ������ ��ȯŸ���� ����
	
	//�⺻ ������ - �Ű������� ���� ������
	//������ �����ڸ� ������ ������ �����Ϸ��� �⺻�����ڸ� �ڵ����� �������
	//������ �����ڸ� �ϳ��� ����� �����Ϸ��� �� �̻� �⺻ �����ڸ� ������ ����
	public Account2() {
		
	}
	
	public Account2(String p_accid, String p_name, int p_balance){
		accId = p_accid;
		name = p_name;
		balance = p_balance;
		
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	//�Ա��ϴ� ����� �޼���
	public void deposit(int money) {
		balance += money;
	}
	
	//���ǻ� �߰��� �޼��� - ��±��
	public void showInfo() {
		System.out.println("���¹�ȣ : " + accId);
		System.out.println("�̸� : " + name);
		System.out.println("�ܾ� : " + balance + "\n");
		
	}

}
