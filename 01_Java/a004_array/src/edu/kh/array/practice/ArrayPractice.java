package edu.kh.array.practice;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner7;
import javax.print.StreamPrintServiceFactory;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class ArrayPractice {

public void ex1() {
		
		int[] arr = new int[9];
		
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
		
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);

		char[] arr = new char[str.length()];
		
		System.out.print("application에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			
			if(ch == arr[i]) {
				System.out.print(i + " ");
				cnt++;
			}
		}
		System.out.println();
		System.out.print(ch + " 개수 : " + cnt);
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
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		
		char[] arr = new char[14];
		
		for(int i = 0; i < 14; i++) {
			arr[i] = str.charAt(i);
		}
		
		for(int i = 0; i < 14; i++) { 
		
			if(i < 8) {
				System.out.print(arr[i]);
			} else {
				System.out.print("*");
			}
		}
	}
	
	
	
	public void ex8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		if(input % 2 == 0 || input < 3) {
			System.out.println("다시 입력하세요.");
		} else {
			
			int[] arr = new int[input];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = i + 1;
			}
			for(int i = 0; i < arr.length; i++) {
				if(i > arr.length / 2) {
					arr[i] = arr.length - i;
				} else {
					arr[i] = i + 1;
				}
				
				if(i != 0) {
					System.out.print(", ");
				}
				System.out.print(arr[i]);
			}
		}
	}
	
	
	
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
		
		for(int i = 0; i < arr.length; i++) {
			double x = (int)(Math.random() * 10 + 1);
			
			System.out.print((int)x + " ");
			
			arr[i] = (int)x;  
			
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
		
	
	
	public void ex11() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int temp = (int)(Math.random() * 10 + 1);
			
			arr[i] = temp;

			for(int j = 0; j < i; j++) {
				if(arr[j] == temp) {
					i--; 
					break;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	
	
	public void ex12() {
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			int x = (int)(Math.random() * 45 + 1);
			
			arr[i] = x;

			for(int j = 0; j < i; j++) {
				if(arr[j] == x) {
					i--; 
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
	}
	
	public void ex13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			for(int j = 0; j < i - 1; j++) {
				if(arr[i] != arr[j]) {
					System.out.print(arr[i]);
					break;
				}
			}
		}

	}
	
	
	public void ex14() {
	
		Scanner sc = new Scanner(System.in);
		
		// 1. 첫 배열 크기 지정
		System.out.print("배열의 크기를 입력 하시오 : ");
		int size = sc.nextInt(); // 입력 버퍼에 개행문자(엔터)가 남음
		
		sc.nextLine(); // 입력 버퍼에 남은 개행문자(엔터) 제거
		
		// 2. 첫 배열 생성
		String[] books = new String[size];
		
		// 3. 첫 배열에 저장할 문자열 입력 받기
		for(int i = 0; i < books.length; i++) {
			System.out.print( (i + 1) + "번째 문자열 : " );
			books[i] = sc.nextLine(); // 입력 버퍼에서 다음 엔터까지 읽어옴
		}
		
		// 4. n이 입력될 때 까지 무한 반복 -> n 입력 시 break
		while(true) {
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'N') {
				break;
			}
			
			// 5. 더 입력 받을 개수 입력
			System.out.print("더 입력하고 싶은 개수 : ");
			int addSize = sc.nextInt();
			sc.nextLine(); // 입력 버퍼 개행문자 제거
			
			// 6. 기존 배열보다 늘어난 개수만큼 큰 새 배열 생성
			String newBooks[] = new String[books.length + addSize];
			
			// 7. 깊은 복사를 통해 기존 배열 내용을 새 배열로 복사
			System.arraycopy(books, 0, newBooks, 0, books.length);
			
			// 8. 새 배열의 빈칸 부터 새로운 입력을 받아서 저장
			for(int i = books.length; i < newBooks.length; i++) {
				System.out.print( (i + 1) + "번째 문자열 : " );
				newBooks[i] = sc.nextLine();
			}
			
			// 9. 기존 참조배열 books에 newBooks의 주소를 얕은 복사
			books = newBooks;
			
		} // while 종료
		
		// 10. 배열에 저장된 모든 값 출력
		 System.out.println(Arrays.toString(books));
		
	}
	
	
	public void scannerEx() { // 14
		
		Scanner sc = new Scanner(System.in);
		
		// 1) next() : 한 단어 (띄어쓰기, 엔터를 만나면 입력 종료)
		//    nextLine() : 한 문장 (엔터를 만나면 입력 종료
		
//		System.out.print("입력 : "); // hello world
//		String str1 = sc.next();
		
//		System.out.println(str1); // hello
		
		System.out.print("입력 : "); // hello world
		String str2= sc.nextLine();
		
		System.out.println(str2); // hello world
		
		// 2) 스캐너 입력 버퍼와 nextXXX의 의미
		
		// 입력 -> 입력 버퍼에 저장 -> nextXXX() 통해서 버퍼 내용을 읽어옴
		
		//				입력 버퍼			 nextXXX()			 후처리
		// nextLine() : hello world(엔터) -> hello world(엔터) - 엔터 제거
		// (다음 엔터)
		
		// nextInt()  :   100(엔터) 		  ->  100
		// (다음 정수) 
		// ** next(), nextDouble(), nextInt() 등
		//    모두 입력 버퍼에서 (엔터)를 제외 하고 내용만 읽어옴 **
		
		System.out.println("----------------------------");
		
		System.out.print("nextInt() : "); // 입력버퍼 : [ 100 (엔터) ]
		int a = sc. nextInt();
		// 100		// 입력버퍼 : [ (엔터) ]
		
		sc.nextLine(); // 입력버퍼 : [  ]
		
		System.out.println("nextLine() : "); // [ a b c(엔터) ]
		String s = sc.nextLine();
		// a b c   // 입력버퍼 :  [   ]
		
		System.out.println("종료");
		
		// [문제점]
		// nextInt() 이후 입력 버퍼에 남아있는 (엔터) 때문에
		// 다음 nextLine() 수행 시 버퍼에 남아있는 (엔터)를 읽어버리기 때문에
		// 추가적인 입력을 시도하지 못하고 다음 코드로 넘어가는 문제 발생.
		
		// [해결방법]
		// 입력을 위한 nextLine() 수행 전
		// 입력 버퍼에서 (엔터)를 제거
		// -> 빈 공간에 sc.nextLine() 구문을 한번 작성하면 (엔터)가 제거됨
	}
	
	
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
		System.out.println();
	}
	
	
	
	
	public void ex18() {}
	public void ex19() {}
	public void ex20() {}
	public void ex21() {}
	public void ex22() {}
	public void ex23() {}
	public void ex24() {}
	
	
	
}
