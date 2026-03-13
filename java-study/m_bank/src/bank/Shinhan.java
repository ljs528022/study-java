package bank;

//Shinhan 클래스. Bank를 상속받음(부모 클래스)
public class Shinhan extends Bank{
	@Override
	// Bank의 입금 메소드를 재정의
	// 입금 로직 수수료 50% 적용.
	public void deposit(int money) {
		
		// 입금 할때 입금 금액의 반을 입금.
		money /= 2;
		
		// 부모의 메소드로 실행.
		super.deposit(money);
	}
}
