package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
//		try {
//			System.out.println(10 / 0);
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		} finally {
//			System.out.println("반드시 실행되는 문장");
//		}
//		사용자에게 정수 1개를 입력받고 출력한다.
//		만약, 사용자가 정수가 아닌 문자열을 입력하면 런타임 오류가 발생한다.
//		이 때, 예외 처리를 사용해서 프로그램이 강제 종료되는 것을 막아본다.
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("원하는 정수 입력 : ");
		
		try {
			num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력해주세요!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(num);
		
		sc.close();
	}
}
