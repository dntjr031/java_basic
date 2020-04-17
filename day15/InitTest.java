package com.day15;

class BBB{
	static int cv = 1; // static ������ ����� �ʱ�ȭ
	int iv = 10; // instance ������ ����� �ʱ�ȭ
	
	static {
		cv = 2; //static �ʱ�ȭ ������ static ���� �ʱ�ȭ
		System.out.println("static �ʱ�ȭ �� ȣ��! cv = " + cv);
		// 0 => 1 => 2
	}
	
	BBB(){
		iv = 20; // �����ڿ��� �ν��Ͻ� ���� �ʱ�ȭ
		System.out.println("������ ȣ��! iv = " + iv);
		// 0 => 10 => 20
	}
}

public class InitTest {

	public static void main(String[] args) {

		System.out.println("InitTest Ŭ������ main�޼��� ȣ��!");
		
		System.out.println("BBB�� cv = " + BBB.cv);
		
		BBB b = new BBB();
		System.out.println("BBB ��ü b�� iv = " + b.iv);
		
		/*
		 [1] static ������ �ʱ�ȭ ����
		 	- �ش� Ŭ������ �޸𸮿� �ε�Ǹ� static������ �����ǰ�
		 	static �ʱ�ȭ ���� �� �ѹ� ȣ��Ǿ� �ʱ�ȭ ��
		 [2] �ν��Ͻ� ������ �ʱ�ȭ ����
		 	- �ν��Ͻ��� �����ɶ� �ν��Ͻ� ������ �����ǰ�
		 	�����ڰ� ȣ��Ǿ� �ʱ�ȭ ��
		 	
		   �ء� Ŭ���� ������ �׻� �ν��Ͻ� �������� ���� �����ǰ� �ʱ�ȭ ��	
		 
		   �� static ������ �ʱ�ȭ ����
		   default �� => ����� �ʱ�ȭ => static �ʱ�ȭ ��
		   
		   �� static ������ �ʱ�ȭ ����
		   default �� => ����� �ʱ�ȭ => ������
		 */

	}

}
