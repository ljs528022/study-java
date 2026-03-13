package classTask;

public class ClassTask11 {
//  우체국 택배(PostOffice)
//	kg당 가격
	
//	박스(Box)
//	kg
	
//	우체국의 택배서비스를 이용하고자 할 때,
//	전달한 모든 박스의 가격을 구한다.
	public static void main(String[] args) {
		Box[] arBox = {
				new Box("김장 김치", 20),
				new Box("배달품", 10),
				new Box("FAX", 1),
		};
		
		PostOffice postService = new PostOffice();
		PostOffice postService1 = new PostOffice();
		PostOffice postService2 = new PostOffice();
		
		System.out.println("우체국 1 배달 총 금액 : " + postService.getPrice(arBox) + " 원");
		System.out.println("우체국 1 배달 총 금액 : " + postService1.getPrice(arBox) + " 원");
		System.out.println("우체국 1 배달 총 금액 : " + postService2.getPrice(arBox) + " 원");
	}	
}
