package controlStatementTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//		반복의 핵심은 반복횟수 최소화이다.
		
//		1 ~ 100 까지 출력
//		100 ~ 1 까지 출력
//		1 ~ 100 까지 짝수만 출력
		
		// 1 ~ 100 까지
//		for(int i = 0; i < 100; i++) {
//			System.out.println(i + 1);
//		}
//		
//		System.out.println("---------------------------");
//		
//		// 100 ~ 1 까지
//		for(int i = 0; i < 100; i++) {
//			System.out.println(100 - i);
//		}
//		
//		System.out.println("---------------------------");
//		
//		// 짝수만 출력
//		for(int i = 0; i < 50; i++) {
//			System.out.println((i + 1) * 2);
//		}
		
//		모듈러스(%): 나머지 연산자
//		예시: 10 % 3 == 1
//		System.out.println(10 % 1);
		
//		짝수 : 2로 나누었을 때 값이 0인 경우
//		홀수 : 2로 나누었을 때 값이 1인 경우
		
//		1 ~ 100 까지 중 짝수만 출력(100번 반복)
//		for(int i = 0; i < 100; i++ ) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		
//		1 ~ 10까지 합 출력
//		1 ~ n 까지 합 출력

		// 1 ~ 10 까지 합 출력
//		int num1 = 0;
//		for(int i = 0; i < 10; i++) {
//			num1 += i + 1;
//		}
//		System.out.println(num1);
	
		// 1 ~ n 까지 합 출력
//		int num = 0;
//		int result = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("원하는 숫자를 입력해주세요! >> ");
//		
//		num = sc.nextInt();
//		
//		for(int i = 0; i < num; i++) {
//			result += i + 1;
//		}
//		
//		System.out.println("1 ~ " + num + " 까지의 합은 : " + result);
		
//		0 1 2 3 0 1 2 3 0 1 2 3 출력
		for(int i = 0; i < 12; i++) {
			System.out.print(i % 4 + " ");
		}
		
	}
}
