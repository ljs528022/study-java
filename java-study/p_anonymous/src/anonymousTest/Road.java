package anonymousTest;

public class Road {
   public static void main(String[] args) {
      
////	  강남점 오픈
//      Nike gangnam = new Nike();
////    익명 클래스로 "판매"와 메뉴 구현
//      gangnam.register(new Form() {
//         
//         @Override
//         public void sell(String order) {
//            for (int i = 0; i < getMenu().length; i++) {
//               if(getMenu()[i].equals(order)) {
//                  System.out.println(order + " 판매 완료");
//               }
//            }
//            
//         }
//         
//         @Override
//         public String[] getMenu() {
//            return new String[] {"축구공", "농구공", "운동화", "축구화"};
//         }
//      });
      
//      잠실점 오픈 / 메뉴는 있지만 판매 방법은 없음.
//      무료 나눔 행사 중.
//	    무료 나눔 행사 중인 지점은 판매를 구현하지 않아도 된다. (강제성 제거)
	   	Nike jamsil = new Nike();
	   	jamsil.register(new FormAdapter() {

			@Override
			public String[] getMenu() {
				return new String[] {"축구공", "농구공", "운동화", "축구화"};
			}
	   	});
   }
}



