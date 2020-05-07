package com.day12;

public class CmdArgsTest2 {

	public static void main(String[] args) {
		//국,영,수 점수 입력받아 총점과 평균 구하기
		if (args.length < 3) {
			System.out.println("명령줄 인수로 국,영,수 점수를 입력하세요");
			return;
		}
		
		int kor = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[1]);
		int math = Integer.parseInt(args[2]);
		
		int sum = kor + eng + math;
		double avg = (double)sum / args.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		avg = (double)sum / args.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
