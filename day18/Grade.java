package com.day18;

import java.util.Scanner;

public class Grade {
	private String name, className;
	private int java, oracle, jsp;
	private int total;
	private double score;
	private String grade;
	public void findTotal() {
		total = java + oracle + jsp;
	}
	public void findScore() {
		score = (int)(total / 3.0 * 100)/100.0;
	}
	public void findGrade() {
		switch((int)(score / 10)) {
			case 10: case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			default: grade = "F";
		}
	}
	public void showInfo() {
		findTotal();
		findScore();
		findGrade();
		System.out.println(name + "\t\t" + className + "\t" + java + "\t" + oracle + "\t" + jsp
				+ "\t" + total + "\t" + score + "\t" + grade);
	}	

	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getOracle() {
		return oracle;
	}
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public Grade(String name, String className, int java, int oracle, int jsp) {
		this.name = name;
		this.className = className;
		this.java = java;
		this.oracle = oracle;
		this.jsp = jsp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}

class Module{
	private static Scanner sc = new Scanner(System.in);
	
	public static int findMenu(){
		System.out.println("1. 성적 입력");
		System.out.println("2. 전체학생의 성적 검색");
		System.out.println("3. 학생별 성적 조회");
		System.out.println("4. 클래스(반)별 성적 조회");
		System.out.println("5. 학생 성적 수정");
		System.out.println("6. 종료");
		System.out.print("선택하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	public static Grade inputData() {
		System.out.println("학생이름, 반, java, oracle, jsp 점수를 입력하세요");
		String name = sc.nextLine();
		String className = sc.nextLine();
		int java = sc.nextInt();
		int oracle = sc.nextInt();
		int jsp = sc.nextInt();
		sc.nextLine();
		Grade g = new Grade(name, className, java, oracle, jsp);
		return g;
		
	}
	
	public static void findTotalSearch(Grade[] g, int j) {
		System.out.println("=========================전체 학생 성적 조회 결과=========================");
		System.out.println("학생이름		클래스	java	oracle	jsp	총점	평균	학점");
		System.out.println("===================================================================");
		for (int i = 0; i < j; i++) {
			g[i].showInfo();
		}
		System.out.println("===================================================================");
	}
	
	public static void findNameSearch(Grade[] g, int j) {
		System.out.println("검색하려는 학생이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("========================="+name+" 학생 성적 조회 결과=========================");
		System.out.println("학생이름		클래스	java	oracle	jsp	총점	평균	학점");
		System.out.println("========================================================================");
		for (int i = 0; i < j; i++) {
			if(g[i].getName().equals(name)) {
				g[i].showInfo();
			}
		}
		System.out.println("=======================================================================");
	}
	
	public static void findClassSearch(Grade[] g, int j) {
		System.out.println("검색하려는 클래스(반)을 입력하세요");
		String className = sc.nextLine();
		System.out.println("========================="+className+" 학생 성적 조회 결과=========================");
		System.out.println("학생이름		클래스	java	oracle	jsp	총점	평균	학점");
		System.out.println("==============================================================================");
		for (int i = 0; i < j; i++) {
			if(g[i].getClassName().equals(className)) {
				g[i].showInfo();
			}
		}
		System.out.println("=============================================================================");
	}
	
	public static void modified(Grade[] g, int j) {
		System.out.println("클래스(반)와 학생이름을 입력하세요");
		String className = sc.nextLine();
		String name = sc.nextLine();
		System.out.println("\n수정하려는 점수를 java, oracle, jsp과목 순으로 입력하세요");
		int java = sc.nextInt();
		int oracle = sc.nextInt();
		int jsp = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < j; i++) {
			if(g[i].getClassName().equals(className) && g[i].getName().equals(name)) {
				g[i].setJava(java);
				g[i].setOracle(oracle);
				g[i].setJsp(jsp);
				break;
			}
		}
		System.out.println("수정이 완료되었습니다.");
	}
}
