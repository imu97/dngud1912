package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

public void ex1() {
		
		int[] arr;
		
		arr = new int[9];
		
		int sum = 0;
		
		for(int i = 1; i <= 9; i++) {
			System.out.print(i + " ");
			
			if(i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println();
		System.out.print("짝수 번째 인덱스 합 : " + sum);
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
		
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.print(i + " ");
		}
	}
	
	
	public void ex4() {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int index = 0;	
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			
		}	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
