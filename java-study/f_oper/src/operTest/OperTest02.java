package operTest;

import java.util.Scanner;

public class OperTest02 {
	public static void main(String[] args) {
//		두 정수를 입력받기
		int num1, num2 = 0;
		String result = null;
		String message = "두 정수를 입력 : ";
		String example = "예) 1 2";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		System.out.println(example);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
//		더 큰 값을 출력하기
//		두 값이 같으면 "두 수가 같습니다" 출력하기
		result = num1 > num2 ? "더 큰 값: " + num1 
				: num1 == num2 ? "두 수가 같습니다" 
						: "더 큰 값: " + num2;
		
		System.out.println(result);
		
		sc.close();
	}
}
