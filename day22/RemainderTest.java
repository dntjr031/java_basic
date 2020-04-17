package com.day22;

import java.util.Scanner;

public class RemainderTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int d = remainder(a, b);
			System.out.println(a + "%" + b + "=" + d);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			sc.close();
		}

	}

	public static int remainder (int a, int b) throws Exception {
		if(b == 0) {
			throw new Exception("������ 0�� �Ǹ� �ȵ˴ϴ�.");
		}
		int d = a%b;
		return d;
	}
}
