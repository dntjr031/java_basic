package com.day10.array;

public class ArrayTest1 {

	public static void main(String[] args) {
		/*
		 * 변수 - 데이터 한개를 저장하기 위해 할당한 저장소
		 * 배열 - 동일한 타입의 데이터 여러 개를 저장하기 위해 할당한 저장소
		 * 		참조형(new 키워드로 메모리에 할당해야 함)
		 * 		default값으로 초기화됨
		 * 		배열 이름에는 참조값(주소값)이 들어감
		 * 		각 요소들은 인덱스(index, 첨자)로 접근 가능
		 */
		
		//[1] 배열선언과 메모리 할당을 따로
		//1. 배열 선언
		int[] arr;
		//2. 메모리 할당
		arr = new int[3]; //정수 3개를 저장할 수 있는 배열
		//3. 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//4. 출력 // 모든상황에서 for문으로 출력
		for(int i=0; i<3;i++) {
			System.out.println(arr[i]);
		}
		
		//[2] 배열선언과 메모리 할당을 동시에
		int[] arr2 = new int[2];
		// 초기화
		arr2[0] = 4;
		arr2[1] = 7;
		//arr2[2] = 8; // error: ArrayIndexOutOfBoundsException
		
		//[3] 배열선언, 메모리 할당, 초기화 모두 동시에
		int[] arr3 = {15,30,21,77,95};
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i] + " ");
		}
		
		System.out.println("\n\narr배열의 크기 : " + arr.length);
		
		//
		int arr4[]; //가능, 그러나 자주 쓰이지 않음 
		arr4 = new int[4]; //default 값으로 초기화
		
		for(int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		//
		//int[] arr5 = new int[] {4,9,7,3}; // new int[] 생략해서 많이 쓰임
		
		//
		//int[] arr6 = new int[4];
		//arr6 = {5,6,4,9}; // error
		
		int[] arr6;
		arr6 = new int[] {1,2,7};
		System.out.println(arr6[0]);
	}
	

}
