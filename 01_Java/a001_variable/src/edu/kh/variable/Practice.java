package edu.kh.variable;

import java.net.MulticastSocket;

public class Practice {

	public static void main(String[] args) {
		
		/* 기본 자료형 8가지
		 * 
		 * 정수형
		 * byte(1), short(2), int(4), long(8, L/l)
		 * 
		 * 실수형
		 * float(4, f/F), double(8)(기본형)
		 * 
		 * 문자형
		 * char(2)
		 * 
		 * 
		 * boolean(1, true/false)
		 * 
		 * [컴퓨터 값 처리 원칙]
		 * 같은 자료형 끼리만 연산 가능, 결과도 같은 자료형
		 * 
		 *  [자동 형변환]
		 *  값의 범위가 다른 자료형끼리의 연산 시
		 *  범위가 작은 자료형을 큰 자료형으로 변환 
		 *  (컴파일러가 자동으로 진행)
		 *  
		 *  [강제 형변환]
		 * 특정한 자료형으로 강제 변환(바꾸고 싶은 자료형 명시)
		 * 데이터 손실이 발생할 수 있다 
		 * */
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2);	// 자동 형변환
		System.out.println((int)dNum);	// 강제 형변환
		System.out.println(iNum2 * dNum); // 작은 자료형에서 큰 자료형으로 형변환 
		System.out.println((double)iNum1); //강제 형변환
		System.out.println((double)iNum1 / iNum2); // 2.5 - 둘중 하나만 형변환을 하거나 둘다 하거나...
		System.out.println((int)fNum); // 강제 형변환
		System.out.println((int)(iNum1 / fNum)); 
		System.out.println(iNum1 / fNum); //3.33333333
		System.out.println(iNum1 / (double)fNum); // 3.3333333333335
		System.out.println((int)ch);
		System.out.println(iNum1 + ch); // ch 자동 형변환
		System.out.println((char)(iNum1 + ch));
		
		
		
		
	}
}
