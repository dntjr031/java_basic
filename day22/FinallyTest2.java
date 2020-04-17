package com.day22;

public class FinallyTest2 {
	public static boolean divider(int n1, int n2) {
		try {
			int res = n1/n2;
			System.out.println(n1 + "/" + n2 + "=" + res);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			System.out.println("finally �κ�");
		}
	}
	public static void main(String[] args) {
		if(divider(10, 2)) {
			System.out.println("������ ���� ����!\n");
		}else {
			System.out.println("������ ���� ����!\n");
		}
		
		if(divider(10, 0)) {
			System.out.println("������ ���� ����!\n");
		}else {
			System.out.println("������ ���� ����!\n");
		}
	}
}
