package edu.kh.array.practice;

public class ArrayPractice {

public void ex1() {
		
		int[] arr;
		
		arr = new int[9];
		
		int sum = 0;
		
		for(int i = 1; i <= 9; i++) {
			System.out.print(i + " ");
			
		}
	}
		
	
	public void ex2() {
		
		int[] arr;
		arr = new int[9];
		
		int sum = 0;
		
		for(int i = 9; i >= 1; i--) {
			System.out.print(i + " ");
			
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println();
		
		System.out.print("홀수 번째 인덱스 합 : " + sum);
		
	}
		
}
