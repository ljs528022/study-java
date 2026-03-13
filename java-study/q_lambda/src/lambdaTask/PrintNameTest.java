package lambdaTask;

public class PrintNameTest {
	
	// 메소드 선언 -> PrintName의 메소드와 String 값 2개를 입력받음
	void printFullName(PrintName printName, String firstName, String lastName) {
		// 인터페이스의 메소드를 실행한 값을 출력.
		System.out.println(printName.getFullName(firstName, lastName));
	}
	
	public static void main(String[] args) {
		// 메소드 호출을 위한 생성자 선언.
		PrintNameTest pt = new PrintNameTest();
		
		// 여기서 인터페이스를 람다식으로 구현
		PrintName printName = (firstName, lastName) -> {
			return firstName + lastName;
		};
		
		// printFullName에 구현한 인터페이스와 값들을 입력.
		pt.printFullName(printName, "이", "정식");
		
		// 메소드 실행 값에 람다식을 바로 작성
		pt.printFullName((l, f) -> f + l, "정식", "이");
	}
}
