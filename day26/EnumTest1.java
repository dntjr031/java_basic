package com.day26;

enum Color{RED, GREEN, BLUE}

public class EnumTest1 {

	public static void main(String[] args) {
		Color c = Color.BLUE;
		System.out.println("c = " + c);
		System.out.println(c + "�� value : " + c.ordinal()+"\n");
		
		//Color[] colArr = Color.values();
		for(Color col : Color.values()) {
			System.out.println( col + "�� value = " + col.ordinal());
		}
		
		/*
		 ���ŵ� ������ ���� 0���� �������� ������ ���������� ��ȯ�Ͽ� ����� �� �ִ�.
		 
		 �������� �ٷ�� ���� �⺻���� �޼ҵ�
		 [1]values() : ���ŵ� ��� ���Ҹ� ������� ��ȯ�ϴ� �޼ҵ�
		 [2]ordinal() : ������ ���ŵ� ������ ���� ������ ��ȯ�ϴ� �޼ҵ�
		 [3]valueOf() : �Ű������� �־��� ��Ʈ���� ���������� ��ġ�ϴ� �̸��� ���� ���Ҹ� ��ȯ�ϴ� �޼���
		 (���� �־��� ��Ʈ���� ��ġ�ϴ� ���Ұ� ���� ��� ���ܹ߻�)
		 */
		
		Color c2 = Color.valueOf("RED");
		System.out.println("\n\n" + c2);
		
		//Color c3 = c.valueOf("Red"); // ���� IllegalArgumentException
		//System.out.println(c3);
	}

}
