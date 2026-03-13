package anonymousTest02;

public class Cafe {
	public static void main(String[] args) {
//		**홍대점은 시식 이벤트 매장입니다**
//		- 메뉴는 등록해야 하지만, 결제 처리는 하지 않습니다
//		- 결제 요청이 들어오면 "무료 시식 이벤트 진행 중" 출력
//		- 시식 이벤트 매장은 결제 처리 메소드를 구현할 강제성이 없어야 합니다
//
//		**강남점은 일반 매장입니다**
//		- 메뉴 등록과 결제 처리 모두 정상 작동
//		- 결제 시 "{메뉴} {가격}원 결제 완료" 출력
		
//		- `OrderAdapter` 추상 클래스 작성
//		- `Main` 클래스에서 익명 클래스로 홍대점과 강남점 구현
//		- `instanceof`를 사용하여 시식 이벤트 매장과 일반 매장 구분
//		CafeHeadquarter gangnam = new CafeHeadquarter();
//		gangnam.registerStore(new Order() {
//			
//			@Override
//			public void processPayment(String menu, int price) {
//				System.out.println(menu + " " + price + "원 결제 완료.");
//			}
//			
//			@Override
//			public String[] getMenuList() {
//				return new String[] {"아메리카노", "카페라때", "에스프레소"};
//			}
//		});
		
		CafeHeadquarter hongdea = new CafeHeadquarter();
		hongdea.registerStore(new OrderAdapter() {
			
			@Override
			public String[] getMenuList() {
				return new String[] {"아메리카노", "카페라때", "에스프레소"};
			}
		});
	}
}