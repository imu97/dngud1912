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
		
		int total = kor + math + eng;
		double avg = total / 3;
		 
		if((kor >= 40 && math >= 40 && eng >= 40) && (avg >= 60)) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int input =sc.nextInt();
		
		switch(input) {
			case 1 : case 3 :  case 5 :  
			case 7 : case 8 : case 10 : case 12 : 
				System.out.printf("%d월은 31일까지 있습니다.", input);break;
			
			case 2 : case 4 : case 6 :
			case 9 : case 11 :
				System.out.printf("%d월은 30일까지 있습니다.", input);break;
			
			default : 
				System.out.printf("%d월은 잘못 입력된 달입니다.", input);
		}
	}
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / (m * m); 
		
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		}else if(bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
	}
	
	
	
	public void practice5() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double mid = sc.nextDouble(); 
		System.out.print("기말 고사 점수 : ");
		double fin = sc.nextDouble(); 
		System.out.print("과제 점수 : ");
		double hw = sc.nextDouble(); 
		System.out.print("출석회수 : ");
		double att = sc.nextDouble(); 
		
		double total = ((mid * 0.2) + (fin * 0.3) + (hw * 0.3) + att);
		
		System.out.println("========== " + "결과 ==========");	
		
		if(att <= (20 - (20 * 0.3))) {
			System.out.printf("Fail [출석 횟수 부족 (%d/20)]",(int)att);
		} else {
			System.out.printf("중간 고사 점수(20) : %.1f\n", mid * 0.2);
			System.out.printf("기말 고사 점수(30) : %.1f\n", fin * 0.3);
			System.out.printf("과제 점수(30) : %.1f\n", hw * 0.3);
			System.out.printf("출석 점수(20) : %.1f\n", att);
			System.out.println("총점 : " + ((mid * 0.2) + (fin * 0.3) + (hw * 0.3) + att));
			
			if(total >= 70) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail [점수미달]");
			}
		} 
	}
}
