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
		
		int[] arr = new int[0];
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.print(i + " ");
		}
	}
	
	
	public void ex4() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("입력 %d : ",i);
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int x = sc.nextInt();
			
		for(int i = 0; i < arr.length; i++) {
			
			if(x == arr[i]) {
				System.out.printf("인덱스 : %d", i);break;
			} else {
				
				if(i == arr.length - 1) {
					System.out.print("일치하는 값이 존재하지 않습니다.");
				}
			} 
		}
	}
	
	
	public void ex5() {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "application";
		char ch = str.charAt(0);
		
		System.out.print("문자열 : ");
		String st = sc.next();
		
		
		
		
	}
	
	
	
	
	public void ex6() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		int sum = 0;
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		System.out.print("배열 0번째 인덱스에 넣을 값 : "); 
		int arr1 = sc.nextInt();
		System.out.print("배열 1번째 인덱스에 넣을 값 : "); 
		int arr2 = sc.nextInt();
		System.out.print("배열 2번째 인덱스에 넣을 값 : "); 
		int arr3 = sc.nextInt();
		System.out.print("배열 3번째 인덱스에 넣을 값 : "); 
		int arr4 = sc.nextInt();
		System.out.print("배열 4번째 인덱스에 넣을 값 : "); 
		int arr5 = sc.nextInt();
			
		arr[0] = arr1;		
		arr[1] = arr2;		
		arr[2] = arr3;		
		arr[3] = arr4;		
		arr[4] = arr5;	
		
		sum += arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		System.out.printf("%d %d %d %d %d\n",arr1, arr2, arr3, arr4, arr5);
		System.out.println("총합 : " + sum);
		
	}
	public void ex7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) :");
		
	}
	
	
	
	public void ex8() {}
	
	
	
	public void ex9() {
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i <= arr.length; i++) {
			double x = (int)(Math.random() * 10 + 1);
			
			System.out.print((int)x + " ");
		}
		System.out.println();
	
	}
	
	
	public void ex10() {
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i <= arr.length; i++) {
			double x = (int)(Math.random() * 10 + 1);
			
			System.out.print((int)x + " ");
		}
		System.out.println();
	
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
				
			if(arr[i] > max) {
				max = arr[i];
			} 
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
	
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
		
		
		
	
	public void ex11() {}
	public void ex12() {}
	public void ex13() {}
	public void ex14() {}
	
	
	public void ex15() {
		
		int[][] arr = new int[3][3];
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print("(" + row + ", " + col + ")" );
			}
			System.out.println();
		}
	}
	
	
	
	public void ex16() {
		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int row = 0; row < arr.length; row++) {
		
			for(int col = 0; col < arr[row].length; col++) {
				System.out.printf("%4d",arr[row][col]);
			}
			System.out.println();
		}
	}
	
	
	
	public void ex17() {
		
		int[][] arr = {{16,15,14,13},{12,11,10,9},{8,7,6,5},{4,3,2,1}};
		
		for(int row = 0; row < arr.length; row++) {
		
			for(int col = 0; col < arr[row].length; col++) {
				System.out.printf("%4d",arr[row][col]);
			}
			System.out.println();
		}
	}
	
	
	
	
	public void ex18() {}
	public void ex19() {}
	public void ex20() {}
	public void ex21() {}
	public void ex22() {}
	public void ex23() {}
	public void ex24() {}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
