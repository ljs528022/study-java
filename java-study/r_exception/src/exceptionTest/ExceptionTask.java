package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		정수 입력받기
//		5칸 배열을 만들어서 해당 인덱스에 입력받은 정수를 담는다.
//		5개 까지만 담을 수 있으며, 6번째 정수가 담기면 오류가 발생한다.
//		단, q를 입력하면 입력을 중단시킨다.
//		if문은 딱 한번만 사용한다 (q 입력시 나가기)
		Scanner sc = new Scanner(System.in);
		int[] arNum = new int[5];
		int i = 0;
		
		System.out.println("정수 입력 : ");
		while (true) {
			System.out.print(i + 1 + "번째 입력 : ");
			String input = sc.next();
			
			if(input.equals("q")) {
				break;
			}
			
			try {
				arNum[i] = Integer.parseInt(input);
				i++;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5개 까지만 입력 가능합니다.");
				break;
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력해주십쇼!");
				i--;
			} catch (Exception e) {
				System.out.println("다시 시도해주세요!");
				i--;
			}
		}
		
		for (int j = 0; j < arNum.length; j++) {
			System.out.print(arNum[j] + " ");
		}
	}
}
