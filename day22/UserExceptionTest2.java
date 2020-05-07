package com.day22;

import java.util.Scanner;

//사용자 정의 예외 클래스 만들기
//Exception을 상속받고, Exception(String message) 생성자에 매개변수를 넣어주면 됨
class AgeException2 extends Exception{

	private static final long serialVersionUID = 1L;

	public AgeException2() {
		super("나이는 양수만 가능합니다"); //public Exception(String message)에 message를 넘기는 것
	}
	
}
public class UserExceptionTest2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			System.out.println("나이 입력");
			int age = sc.nextInt();
			if(age<0) {
				throw new AgeException2();
			}
			
			System.out.println("나이 : " + age);
		}catch(AgeException2 e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		
		System.out.println("\n====next====");
	}

}
