package inputTest;

import java.util.Scanner;

public class InputTest04 {
	public static void main(String[] args) {
		// 나이와 이름을 입력받고 출력하기
		int age = 0;
		String name = null;
		String result = null;
		
		// 질문 저장
		String quetion = "나이와 이름을 입력해주세요!";
		String example = "예) 20 제임스";
		
		// Scanner 선언
		Scanner sc = new Scanner(System.in);
		
		// 질문 출력
		System.out.println(quetion);
		System.out.println(example);
		
		// 값 받아와서 형변환
		age = Integer.parseInt(sc.next());
		name = sc.next();
		
		// result 에 통합
		result = "당신의 나이는 " + age + "살이고 이름은 " + name + "입니다.";
		
		// 출력
		System.out.println(result);
		
		
		sc.close();
	}
}
