package controlStatementTest;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
//      심리 테스트
//      
//      Q. 당신이 좋아하는 색을 선택하세요.
//      1. 빨간색
//      2. 노란색
//      3. 검은색
//      4. 흰색
//      
//      빨간색 : 불같고 열정적이고 적극적이다.
//      노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//      검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//      흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
		
		int answer = 0;
		String quetion = "Q. 당신이 좋아하는 색을 선택하세요.\n1. 빨간색\n2. 노란색\n3. 검은색\n4. 흰색";
		String example = "'숫자'로 입력해주세요 >> ";
		String result = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(quetion);
		System.out.print(example);
		
		answer = sc.nextInt();
		
		switch (answer) {
			case 1:
				result = "불같고 열정적이고 적극적이다.";
				break;
			case 2:
				result = "발랄하고 밝고 귀엽고 개성있고 착하다.";
				break;
			case 3:
				result = "묵묵하고 든든하고 냉철하고 멋지다.";
				break;
			case 4:
				result = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
				break;
			default:
				result = "입력된 값이 올바르지 않습니다.";			
				break;
		}
	
		System.out.println(result);
		
		sc.close();	
	}
}
