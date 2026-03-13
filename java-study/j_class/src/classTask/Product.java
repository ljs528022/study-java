package classTask;

public class Product {
	// 상품들 값 선언 이름, 금액, 재고
	String name;
	int price;
	int count;
	
	// 기본 생성자
	public Product() {;}

	// 생성자
	public Product(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
}
