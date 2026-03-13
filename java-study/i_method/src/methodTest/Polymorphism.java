package methodTest;

public class Polymorphism {
	int add(int num1, int num2) {
		System.out.println("두 정수의 덧셈");
		return num1 + num2;
	}
	
	int add(int num1, int num2, int num3) {
		System.out.println("세 정수의 덧셈");
		return num1 + num2 + num3;
	}
	
	double add(double num1, double num2) {
		System.out.println("두 실수의 덧셈");
		return num1 + num2;
	}
	
	int add(int... nums) {
		System.out.println("여러 정수의 총합");
		int total = 0;
		for (int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		int result = new Polymorphism().add(1, 2, 3, 4, 5);
		
		System.out.println(result);
	}
}
