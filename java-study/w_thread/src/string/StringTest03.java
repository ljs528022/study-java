package string;

public class StringTest03 {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("이름: ");
		stringBuilder.append("이정식");
		
		System.out.println(stringBuilder.toString());
	}
}
