package castingTest;

public class CastingTest03 {
	public static void main(String[] args) {
		System.out.println("10" + 4);

		int num = Integer.parseInt("10");
		int result = num + 4;
		System.out.println(result);
		
//		"11" + "21" = 32
		int num1, num2, result1 = 0;
		num1 = Integer.parseInt("11");
		num2 = Integer.parseInt("21");
		result1 = num1 + num2;
		System.out.println(result1);
		
	}
}
