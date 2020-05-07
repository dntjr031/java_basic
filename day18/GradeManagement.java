package com.day18;

public class GradeManagement {

	public static void main(String[] args) {
		
		Grade[] g = new Grade[100];
		
		int i = 0;
		while(i < g.length) {
			int n = Module.findMenu();
			System.out.println();
			if(n == 1) {
				g[i] = Module.inputData();
				i++;
				continue;
			}else if(n == 2) {
				Module.findTotalSearch(g, i);
			}else if(n == 3) {
				Module.findNameSearch(g, i);
			}else if(n == 4) {
				Module.findClassSearch(g, i);
			}else if(n == 5) {
				Module.modified(g, i);
			}else if(n == 6) {
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("잘못입력하였습니다.");
				continue;
			}
		}// while

	}//main

}//class

