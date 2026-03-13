package inputTest;

import java.util.Scanner;

public class InputTest05 {
	public static void main(String[] args) {
//		두 정수를 입력받은 뒤 곱셈의 결과가 30보다 큰지 검사한다.
//		1. 30 보다 클 때: "30보다 큽니다" 출력
//		2. 30보다 작을 때: "30보다 작습니다" 출력
//		3. 30과 같을 때는 없다고 가정한다.
		
		int num1 = 0, num2 = 0;
		String quetion = "두 정수를 입력해주세요.";
		String example = "ex) 1 2 >> ";
		boolean result;
		String resultMessage = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(quetion);
		System.out.println(example);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		result = (num1 * num2) >= 30;
		
		if(result) {
			resultMessage = "30보다 큽니다";
		} else {
			resultMessage = "30보다 작습니다";
		}
		
		System.out.println(resultMessage);
		
	}
}
