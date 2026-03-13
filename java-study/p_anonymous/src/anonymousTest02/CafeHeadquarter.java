package anonymousTest02;

public class CafeHeadquarter {
    public void registerStore(Order order) {
        System.out.println("=== 메뉴 목록 ===");
        for (String menu : order.getMenuList()) {
            System.out.println(menu);
        }
        
        // 여기에 로직 작성 필요
        if(order instanceof OrderAdapter) {
        	System.out.println("무료 시식 이벤트 진행 중");
        } else {
        	order.processPayment("아메리카노", 4500);
        }
    }
}

