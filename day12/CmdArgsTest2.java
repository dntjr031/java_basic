package com.day12;

public class CmdArgsTest2 {

	public static void main(String[] args) {
		//��,��,�� ���� �Է¹޾� ������ ��� ���ϱ�
		if (args.length < 3) {
			System.out.println("����� �μ��� ��,��,�� ������ �Է��ϼ���");
			return;
		}
		
		int kor = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[1]);
		int math = Integer.parseInt(args[2]);
		
		int sum = kor + eng + math;
		double avg = (double)sum / args.length;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		
		sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		avg = (double)sum / args.length;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);

	}

}
