package com.day9;

public class MathodTest5 {
	
	public static int getSum(int num) { //매개변수 num
		int sum = 0; //지역변수 sum
		
		//매개변수도 지역변수의 일종이다
		//매개변수 num과 지역변수 sum은 getSum() 메서드내에서 사용가능하고
		// 해당 매서드를 벗어나면 소멸된다.
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int sum = getSum(10);
		System.out.println("1~10까지의 합 : " + sum);
		
		int num = 100;
		sum = getSum(num);
		System.out.println("1~" + num +"까지의 합 : " + sum);

	}

}
