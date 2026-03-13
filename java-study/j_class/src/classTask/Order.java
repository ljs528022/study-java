package classTask;

public class Order {
	// 총 금액, 상품들(배열)
	int total;
	Product[] products;
	// 기본 생성자
	public Order() {;}

	// 생성자 + 총 금액 계산
	public Order(Product[] products) {
		this.products = products;
		
		// 상품들의 총 금액 계산
		for (int i = 0; i < products.length; i++) {
			// 총 금액 = 상품 금액 * 상품 재고
			total += (products[i].price * products[i].count);
		}
	}
	
	
}
