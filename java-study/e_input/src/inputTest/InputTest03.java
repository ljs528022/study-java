package inputTest;

import java.util.Scanner;

public class InputTest03 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력 받은 후 덧겜 결과 출력
		
		int num1, num2, num3 = 0;
		int result = 0;
		String quetion = "3개의 정수를 띄어서 입력해주세요! >> ";
		String example = "예) 1 2 3";
		String plus = "num1 + num2 + num3 = ";
		
		// Scanner 선언
		Scanner sc = new Scanner(System.in);
		
		// 값 입력
		System.out.println(quetion);
		System.out.println(example);
		
		// 입력 받은 값 형변환
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
		num3 = Integer.parseInt(sc.next());
		
		// + 연산
		result = num1 + num2 + num3;
		
		// 출력
		System.out.println(plus + result);
		
		// Scanner 종료
		sc.close();
	}
}
