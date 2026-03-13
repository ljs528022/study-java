package bank;

//Kookmin 클래스. Bank를 상속받음(부모 클래스)
public class Kookmin extends Bank {
	@Override
	// Bank의 출금 메소드를 재정의
	// 출금 로직 수수료 50% 적용
	public void withdraw(int money) {
		
		// 출금할 때 money를 1.5배(+ 50%) 하여 잔액에서 감소.
		money *= 1.5;
		
		// 부모의 메소드로 실행.
		super.withdraw(money);
	}
}
