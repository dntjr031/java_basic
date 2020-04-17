package com.day24;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		
		
		String s1 = "test.txt";
		String sub1 = s1.substring(0, s1.lastIndexOf('.'));
		String sub2 = s1.substring(s1.lastIndexOf('.'));
		System.out.println("파일명:" + sub1 + "확장자:" + sub2);
		
		System.out.println();
		String s2 = "안녕하세요\n\n 저는 홍길동입니다.";
		String reS = s2.replace("\n\n", "<br>");
		System.out.println(reS);
		
		System.out.println();
		String s3 = "c:\\shop\\upload\\test.txt";
		String sub3 = s3.substring(s3.lastIndexOf("\\") + 1, s3.lastIndexOf("."));
		String sub4 = s3.substring(s3.lastIndexOf(".") + 1);
		String sub5 = s3.substring(0,s3.lastIndexOf("\\"));
		System.out.println("폴더:" + sub5);
		System.out.println("파일명:" + sub3);
		System.out.println("확장자:" + sub4);
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("URL주소를 입력하세요");
		String add = sc.nextLine();
		if(add.indexOf("http://www.mall.com") != -1) {
			System.out.println("해당 url 주소:" + add);
		}else{
			System.out.println("url 주소가 적합하지 않습니다.");
		}
		
		System.out.println();
		System.out.println("주민등록번호를 입력하세요(하이픈 없이)");
		String id = sc.nextLine();
		String gender = "";
		
		if(id.substring(6,7) == "1" || id.substring(6,7) == "3") {
			gender = "남";
		}else if(id.substring(6,7) == "2" || id.substring(6,7) == "4"){
			gender = "여";
		}
		
		String year;
		if(id.substring(6,7) == "3" || id.substring(6,7) == "4") { // equals사용도 가능
			year = "20" + id.substring(0,2);
		}else if(id.substring(6,7) == "1" || id.substring(6,7) == "2"){
			year = "19" + id.substring(0,2);
		}else {
			year = "잘못입력";
		}
		
		String month = id.substring(2, 4);
		String day = id.substring(4,6);
		System.out.println(year + "년 " + month + "월 " + day + "일 " + ", " + gender);
		
		sc.close();
	}

}
