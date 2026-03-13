package objectTest;

public class EqualsTest {
	public static void main(String[] args) {
		Customer customer = new Customer(1, "이정식");
		boolean isSame = customer.equals(new Customer(1, "이정식"));
		
		System.out.println(isSame);
	}
}
