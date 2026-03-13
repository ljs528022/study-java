package anonymousTest02;

public interface Order {
	public String[] getMenuList();
	public void processPayment(String menu, int price);
}
