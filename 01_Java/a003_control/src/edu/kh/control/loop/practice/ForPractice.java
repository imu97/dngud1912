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
		
		
		public void practice4() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫 번째 숫자 :");
			int input1 = sc.nextInt();
			System.out.print("두 번째 숫자 :");
			int input2 = sc.nextInt();
			
			if(input2 < 0) {
				System.out.print("1 이상으; 숫자를 입력해주세요.");
			}
		}
		
		public void practice5() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자 : ");
			int input = sc.nextInt();
			
			for(int i = 1; i <= 9; i++) {
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
