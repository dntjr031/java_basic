package com.day9;

import java.util.Scanner;

public class CompareNumber {
	
	public static int findAnswer() {
		int random = (int)(Math.random()*100+1);
		return random;
	}
	
	public static int findAnswer2(int a, int b) {
		int random = (int)(Math.random()*(b - a + 1) + a);
		return random;
	}

	public static void main(String[] args) {
		
		//public static double random()
		/*=> 0.0~1.0 ������ ������ �Ǽ��� ����(0.0 <= �� < 1.0)
		 * 
		 * 1) �߻���Ű���� ���� ������ �� ���� ���Ѵ�
		 * 2)���۰��� ���Ѵ�
		 * 3) int�� ����ȯ �Ѵ�.
		 * 
		 * ��1) 1~100 ������ ������ ����
		 * 0.0 <= Math.random() * 100 < 100.0
		 * 1.0 <= Math.random() * 100 + 1 < 101.0
		 * 1 <= (int)(Math.random() * 100 + 1) < 101
		 * 
		 * ��2) 0~100 ������ ������ ����
		 * 0.0 <= Math.random() * 101 < 101.0
		 * 0 <= (int)(Math.random() * 101) < 101
		 * 
		 * ��3) A ~ Z ������ ������ �빮��
		 * A(65) <= Math.random() * 26 + 65('A') < 91.0
		 * 65 <= (int)(Math.random() * 26 + 65) < 91
		 * 
		 * ��4) d~g ������ ������ �ҹ���
		 * 100 <= Math.random() * 4 + 'd' < 104
		 * 100 <= (int)(Math.random() * 4 + 'd') < 104
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���� ���۰� ���� �Է��ϼ���");
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int answer = findAnswer2(start, end);
		
		String result = "";
		for(int i = 0; i < 4 ; i++) {
			System.out.println("��ȣ�� �Է��ϼ���");
			int num = sc.nextInt();
			
			if(answer == num) {
				System.out.println("�����Դϴ�!!");
				
				break;
			} 
			
			if(i == 3) {
				result = "����! ������ȸ�� ���� : " + answer;
			}else {
				
				if(answer > num) {
					result = "�� �� ū ���� �Է��ϼ���";
				
				}else {
					result = "�� �� ���� ���� �Է��ϼ���";
				}
				
			}
			System.out.println(result);
		}
		
		sc.close();
		
	}

}
