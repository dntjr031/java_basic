package com.day25;

public class BuilderTest {

	public static void main(String[] args) {
		//append() - ���޵� ���� StringBuilder�� �ν��Ͻ��� �����ϰ� �ִ� ���ڿ� �������� ���� ������ ���·� �߰���
		//public StringBuffer append(String str)
		StringBuilder sb = new StringBuilder("ab");
		sb.append(123);
		sb.append(true);
		sb.append('A');
		sb.append(25).append(3.41);
		System.out.println(sb+"\n");
		
		sb.insert(2, false);
		System.out.println("insert�� : " + sb + "\n");
		/*
		 public StringBuilder insert(int offset, String b)
		 
		 insert(2, "��") �޼���
		 - ��ġ(index)�� 2�� ������, �ι�° �Ű������� �������·� ����
		 */
		sb.insert(sb.length(), "test");
		System.out.println("����sb = " + sb);
	}

}
