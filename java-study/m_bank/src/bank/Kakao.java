package bank;

// Kakao 클래스. Bank를 상속받음(부모 클래스)
public class Kakao extends Bank{
	@Override
	// Bank의 잔액 조회 메소드를 재정의
	public int showBalance() {
		
		// money값의 반값을 잔액으로 출력.
		this.setMoney(this.getMoney() / 2);
		
		// 부모의 메소드를 리턴.
		return super.showBalance();
	}
}
