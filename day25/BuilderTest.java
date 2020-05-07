package com.day25;

public class BuilderTest {

	public static void main(String[] args) {
		//append() - 전달된 값을 StringBuilder의 인스턴스가 저장하고 있는 문자열 데이터의 끝에 문자의 형태로 추가함
		//public StringBuffer append(String str)
		StringBuilder sb = new StringBuilder("ab");
		sb.append(123);
		sb.append(true);
		sb.append('A');
		sb.append(25).append(3.41);
		System.out.println(sb+"\n");
		
		sb.insert(2, false);
		System.out.println("insert후 : " + sb + "\n");
		/*
		 public StringBuilder insert(int offset, String b)
		 
		 insert(2, "값") 메서드
		 - 위치(index)가 2인 지점에, 두번째 매개변수를 문자형태로 저장
		 */
		sb.insert(sb.length(), "test");
		System.out.println("최종sb = " + sb);
	}

}
