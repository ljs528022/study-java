package inputTest;

import java.util.Scanner;

public class InputTest02 {
	public static void main(String[] args) {
//		반려동물의 이름을 입력받고 출력하기
		String quetion = "당신의 반려동물의 이름은? >>";
		String answer = "당신의 반려동물의 이름 : ";
		String name = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(quetion);
		name = sc.next();
		
		System.out.println(answer + name);
		
		sc.close();
	}
}
