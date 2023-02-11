package edu.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	public static void main(String[] args) {
		
		// 정수를 하나 입력 받아 양수/음수/0 을 구분하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		String result = input == 0 ? "0": input > 0 ?  "양수" : "음수" ;
		
		System.out.println(result + "입니다.");
	}
	
	
}
