package com.day8;

public class LabelFor {

	public static void main(String[] args) {
		
		/*
		 * 이름 붙은 반복문
		 * - 여러 반복문이 중첩되어 있을 때 반복문 앞에 이름(laber)을 붙이고
		 * break 문과 continue 문에 이름(laber)을 지정해 줌으로써
		 * 하나 이상의 반복문을 벗어나거나 반복을 건너 뛸 수 있다.
		 */

		Loop1: for(int i =2; i <= 9; i++) {
					for(int j = 1; j<= 9; j++) {
						if(j == 5) {
							break Loop1;
							//continue Loop1;
							//break;
							//continue;
							
						}
						System.out.println(i + " * " + j + " = " + i * j);
					}
					System.out.println();
		}

	}

}
