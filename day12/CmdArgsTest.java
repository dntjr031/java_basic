package com.day12;

public class CmdArgsTest {

	public static void main(String[] args) {
		// ����� �μ�
		/*
		 * Ŀ�ǵ������ ���� �Է¹ޱ�
		 * - ���α׷��� ������ �� Ŭ���� �̸� �ڿ� ���鹮�ڷ� �����Ͽ�
		 * ���� ���� ���ڿ��� ���α׷��� ���� �� �� ����
		 * ��) d:>java CmdArgsTest hong 123
		 * 
		 * Ŀ�ǵ������ ���� �Էµ� �� ���ڿ��� String�迭�� ��ܼ�
		 * main�޼����� �Ű�����(args)�� ���޵�
		 * 
		 * args[0] => hong
		 * args[1] => 123
		 */
		
		if(args.length < 2) {
			System.out.println("����� �μ��� �̸�, ���̸� �Է��ϼ���!!");
			return;
		}
		
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);

	}

}
