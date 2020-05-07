package com.day15;

import java.util.Scanner;

public class PhoneInfoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneInfo[] ph = new PhoneInfo[100];
		
		int i = 0;
		while (i < ph.length) {
			PhoneBook.showMenu(); // 메뉴선택
			int a = sc.nextInt();
			sc.nextLine();
			
			if(a == 1) {
				ph[i] = PhoneBook.inputData(); // 데이터 입력
				System.out.println("데이터 입력이 완료되었습니다.");
				i++;
				continue;
			}else if(a == 2) {
				System.out.println("전체 데이터 조회를 시작합니다.");
				for (int j = 0; j < i; j++) {
					ph[j].printInfo();
				}
				continue;
			}else if(a == 3) {
				System.out.println("데이터 검색을 시작합니다.");
				int search = PhoneBook.search(ph, i);
				if(search < 0) {
					System.out.println("없는 데이터입니다.");
					continue;
				}
				ph[search].printInfo();
				continue;
			}else if(a == 4) {
				System.out.println("데이터 삭제를 시작합니다.");
				int search = PhoneBook.search(ph, i);
				if(search < 0) {
					System.out.println("없는 데이터입니다.");
					continue;
				}
				PhoneBook.delete(ph, search);
				i--;
				continue;
			}else {
				break;
			}
			
			
		}
		
		System.out.println("종료되었습니다.");
		
		sc.close();

	}

}
