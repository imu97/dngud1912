package edu.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String inputName = sc.next();
		
		System.out.print("학년 : ");
		int inputAge = sc.nextInt();
		
		System.out.print("반 : ");
		int inputClass = sc.nextInt();
		
		System.out.print("번호 : ");
		int inputNumber = sc.nextInt();
		
		System.out.print("성별 : ");
		String inputSex = sc.next();;
		
		System.out.print("성적 : ");
		double inputGrade = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다. ",
				inputAge, inputClass, inputNumber, inputName, inputSex, inputGrade );

	}
	
}
