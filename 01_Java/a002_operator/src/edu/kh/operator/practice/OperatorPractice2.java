package edu.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	public static void main(String[] args) {
		
//키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int classRooom = sc.nextInt();
		
		System.out.print("번호 : ");
		int number = sc.nextInt();
		
		System.out.print("성별 : ");
		String gender = sc.next();
		
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f점 입니다. ",
				grade, classRooom, number, name, gender, score );
		
	}
	
}
