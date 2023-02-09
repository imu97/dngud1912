package edu.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int input1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int input2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int input3 = sc.nextInt();
		
		int result1 = input1 + input2 + input3;
		
		System.out.println((result1));
		System.out.println((double)result1 / 3 );
		
		boolean result2 = (input1 >= 40 && input2 >= 40 && input3 >= 40 &&(double)result1 / 3 >= 60); 
		System.out.println("합격");
	}
	
	
}
