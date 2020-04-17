package com.day19;

class Exam1 { 
	
	static void action(Robot arr){
		if(arr instanceof DanceRobot) {
			((DanceRobot)arr).dance();			
		}else if(arr instanceof SingRobot) {
			((SingRobot)arr).sing();
		}else if(arr instanceof DrawRobot) {
			((DrawRobot)arr).draw();
		}
	}
	
	public static void main(String[] args) { 
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()}; 
		
		for(int i=0; i< arr.length;i++) 
			action(arr[i]); 
		
	} // main
	
}

class Robot {
	
} 

class DanceRobot extends Robot { 
	void dance() { 
		System.out.println("���� ��ϴ�.");
	} 
} 

class SingRobot extends Robot { 
	void sing() { 
		System.out.println("�뷡�� �մϴ�."); 
	} 
} 

class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
} 