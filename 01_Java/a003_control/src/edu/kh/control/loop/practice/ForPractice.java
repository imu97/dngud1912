package edu.kh.control.loop.practice;

import java.util.Scanner;

// 문제풀이용 클래스
public class ForPractice {

		public void practice1() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("1이상의 숫자를 입력해 주세요 : ");
			int input = sc.nextInt();
			
			if(input <= 0) {
					System.out.print("1 이상의 숫자를 입력해주세요.");
			}else {
					for(int i = 1; i <= input; i++) {
					System.out.print(i + " ");
			}
					System.out.println();
		}
	}
	
		
		public void practice2() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int input = sc.nextInt();
			
			if(input <= 0) {
				System.out.print("1 이상의 숫자를 입력하세요.");
			}else {
				for(int i = input; i >= 1; i--) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
		
		
		public void practice3() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수를 하나 입력하세요 : ");
			int input = sc.nextInt();
			
			int sum = 0;
			
			for(int i = 1; i <= input; i++) {
				sum += i;
				System.out.print(i);
				
				// i == input == 마지막
				if(i != input) { // == 마지막이 아니다
					System.out.print(" + ");
				}
			}
			System.out.print(" = " + sum);
		}
		
		
//		public void practice4() {
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.print("첫 번째 숫자 :");
//			int input1 = sc.nextInt();
//			System.out.print("두 번째 숫자 :");
//			int input2 = sc.nextInt();
//			
//			if(input1 < 0 && input2 < 0) {
//				System.out.print("1 이상의 숫자를 입력해주세요.");
//			}
//		}
		
	
		public void practice5() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자 : ");
			int input = sc.nextInt();
			
			System.out.println("==== " + input + "단 ====");
			
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d \n", input, i, input * i);
			}
		}
		
		
		public void practice6() {
			
		}
		public void practice7() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			for(int x = 1; x <= input; x++ ) {
				
				for(int i = 1; i <= x; i++) {
					System.out.printf("*", i);
				}
				System.out.println();
			}
		}
		
		
		public void practice8() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			for(int x = input; x >= 1; x--) {
				
				for(int i = x; i >= 1; i--) {
					System.out.printf("*",i);
				}
				System.out.println();
			}
		} 
		public void practice9() {
			
		}
		public void practice10() {
			
		}
		public void practice11() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("정수 입력 :  ");
			int input = sc.nextInt();
			
			for(int row = 1; row <= input; row++) {
				
				/*for문 2개 사용*/
//				//빈칸 먼저 출력
//				for(int col = input - row; col >= 1; col--) {
//					System.out.print(" ");
//				}
//				
//				for(int col = 1; col <= row * 2 - 1; col++) {
//					System.out.print("*");
//				}
//				
//				System.out.println();
//			}
				
				/*for문 1개, if-else 1개*/
				
				for(int col = 1; col <= input + row - 1; col++) {
					
					if(input - row >= col) {
						System.out.print(" ");
					} else {
					System.out.print("*");
					}
				}
				System.out.println();
			}
		}	
		
		public void practice12() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("정수 입력 : ");
			int input = sc.nextInt();
			
			for(int row = 1; row <= input; row++) {
				
				for(int col = 1; col <= input; col++) {
					if(row == 1 || row == input || col == 1 || col == input) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
		public void practice13() {
			
		}
		
		
		
		
		
		
		
		
		
		
		
}
