package classTask;

// 상품 클래스
// 상품명
// 상품 가격
// 상품 재고

// 주문 클래스
// 주문 번호
// 상품들

// 할인 쿠폰 클래스
// 쿠폰 이름
// 할인 가격

// 주문에서 결제할 총 금액을 계산할 수 있다.

public class ClassTask06 {
	public static void main(String[] args) {		
		// 화면
		
		// 상품 선언
		Product[] products = {
				// 각 상품들의 이름, 가격, 재고 입력
				new Product("휴지", 1000, 5),
				new Product("쌀", 42000, 1),
				new Product("물", 1000, 6),
				new Product("마우스", 32000, 1),
		};
		
		// 주문 선언 -> 위에 선언한 상품을 입력
		Order order = new Order(products);
		
		// 주문의 총 금액 출력
		System.out.println(order.total + "원");
	}
}
