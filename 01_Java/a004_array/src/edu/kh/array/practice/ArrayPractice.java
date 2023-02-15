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
		
		System.out.print("입력 0 : ");
		int num0 = sc.nextInt();
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 3 : ");
		int num3 = sc.nextInt();
		System.out.print("입력 4 : ");
		int num4 = sc.nextInt();
		System.out.print("검색할 값 : ");
		int i = sc.nextInt();
		
	}
	public void ex5() {}
	public void ex6() {}
	public void ex7() {}
	public void ex8() {}
	public void ex9() {}
	public void ex11() {}
	public void ex12() {}
	public void ex13() {}
	public void ex14() {}
	public void ex15() {}
	public void ex17() {}
	public void ex18() {}
	public void ex19() {}
	public void ex20() {}
	public void ex21() {}
	public void ex22() {}
	public void ex23() {}
	public void ex24() {}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
