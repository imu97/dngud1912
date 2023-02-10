package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
 
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input <= 0) {
			System.out.println("양수만 입력해주세요");
		}else if(input % 2 == 0) {
			System.out.println("짝수입니다."); 
		}else {
			System.out.println("홀수입니다.");
		}
	}
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		
		
		
	}
	
	
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력: ");
		int month = sc.nextInt();
		
		String result;
		
		
		
		
		
	}
	public void practice4() {
		
	}
	public void practice5() {
		
	}
}
