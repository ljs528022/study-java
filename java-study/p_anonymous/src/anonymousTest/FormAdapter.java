package anonymousTest;

// FormAdapter에서 getMenu는 구현되지 않아도 되도록 하기 위해
// FormAdapter도 '추상'으로 만들어 오류를 없앤다.
// FormAdapter는 Form를 구현하기 위해 선언되었다.
public abstract class FormAdapter implements Form {
	
	// 익명 클래스 구현에서의 강제성을 없애기 위해 sell을 구현.
	@Override
	public void sell(String order) {;}
}
