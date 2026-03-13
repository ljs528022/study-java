package anonymousTest;

public class Nike {
	// 상품 등록 메소드
   public void register(Form form) {
      for (int i = 0; i < form.getMenu().length; i++) {
         System.out.println(form.getMenu()[i]);
      }
      
      // form를 받아왔을 때 form이 FormAdapter면 if문으로 들어가고,
      // Form이면 FormAdapter와 다르기에 else로 들어간다.
      if(form instanceof FormAdapter) {
    	  System.out.println("무료 나눔 행사 중");
      } else {
    	  form.sell("축구공");
      }

   }
}