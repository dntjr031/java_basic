package com.day15;

import java.util.Scanner;

public class PhoneInfoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneInfo[] ph = new PhoneInfo[100];
		
		int i = 0;
		while (i < ph.length) {
			PhoneBook.showMenu(); // �޴�����
			int a = sc.nextInt();
			sc.nextLine();
			
			if(a == 1) {
				ph[i] = PhoneBook.inputData(); // ������ �Է�
				System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
				i++;
				continue;
			}else if(a == 2) {
				System.out.println("��ü ������ ��ȸ�� �����մϴ�.");
				for (int j = 0; j < i; j++) {
					ph[j].printInfo();
				}
				continue;
			}else if(a == 3) {
				System.out.println("������ �˻��� �����մϴ�.");
				int search = PhoneBook.search(ph, i);
				if(search < 0) {
					System.out.println("���� �������Դϴ�.");
					continue;
				}
				ph[search].printInfo();
				continue;
			}else if(a == 4) {
				System.out.println("������ ������ �����մϴ�.");
				int search = PhoneBook.search(ph, i);
				if(search < 0) {
					System.out.println("���� �������Դϴ�.");
					continue;
				}
				PhoneBook.delete(ph, search);
				i--;
				continue;
			}else {
				break;
			}
			
			
		}
		
		System.out.println("����Ǿ����ϴ�.");
		
		sc.close();

	}

}
