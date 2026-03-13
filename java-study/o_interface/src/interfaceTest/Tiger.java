package interfaceTest;

public class Tiger implements Animal {

	@Override
	public void showHands() {
		System.out.println("내 손이 사라진다.");
	}

	@Override
	public void sitDown() {
		System.out.println("내가 앉는다.");
		
	}

	@Override
	public void poop() {
		System.out.println("어흥~");
		
	}

	@Override
	public void waitNow() {
		System.out.println("기다리지 않는다");
		
	}
}
