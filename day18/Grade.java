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
		System.out.println("1. ���� �Է�");
		System.out.println("2. ��ü�л��� ���� �˻�");
		System.out.println("3. �л��� ���� ��ȸ");
		System.out.println("4. Ŭ����(��)�� ���� ��ȸ");
		System.out.println("5. �л� ���� ����");
		System.out.println("6. ����");
		System.out.print("�����ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	public static Grade inputData() {
		System.out.println("�л��̸�, ��, java, oracle, jsp ������ �Է��ϼ���");
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
		System.out.println("=========================��ü �л� ���� ��ȸ ���=========================");
		System.out.println("�л��̸�		Ŭ����	java	oracle	jsp	����	���	����");
		System.out.println("===================================================================");
		for (int i = 0; i < j; i++) {
			g[i].showInfo();
		}
		System.out.println("===================================================================");
	}
	
	public static void findNameSearch(Grade[] g, int j) {
		System.out.println("�˻��Ϸ��� �л��̸��� �Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("========================="+name+" �л� ���� ��ȸ ���=========================");
		System.out.println("�л��̸�		Ŭ����	java	oracle	jsp	����	���	����");
		System.out.println("========================================================================");
		for (int i = 0; i < j; i++) {
			if(g[i].getName().equals(name)) {
				g[i].showInfo();
			}
		}
		System.out.println("=======================================================================");
	}
	
	public static void findClassSearch(Grade[] g, int j) {
		System.out.println("�˻��Ϸ��� Ŭ����(��)�� �Է��ϼ���");
		String className = sc.nextLine();
		System.out.println("========================="+className+" �л� ���� ��ȸ ���=========================");
		System.out.println("�л��̸�		Ŭ����	java	oracle	jsp	����	���	����");
		System.out.println("==============================================================================");
		for (int i = 0; i < j; i++) {
			if(g[i].getClassName().equals(className)) {
				g[i].showInfo();
			}
		}
		System.out.println("=============================================================================");
	}
	
	public static void modified(Grade[] g, int j) {
		System.out.println("Ŭ����(��)�� �л��̸��� �Է��ϼ���");
		String className = sc.nextLine();
		String name = sc.nextLine();
		System.out.println("\n�����Ϸ��� ������ java, oracle, jsp���� ������ �Է��ϼ���");
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
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}
}