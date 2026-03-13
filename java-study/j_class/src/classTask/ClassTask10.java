package classTask;

//온라인 게임 아이템 구매

//게임샵
//아이템이름
//가격
//재고

//플레이어
//닉네임
//게임머니
//할인율
public class ClassTask10 {
	public static void main(String[] args) {
		GameShop gameShop = new GameShop("낡은 검", 10000, 5);
		
		Player lee = new Player("이정식", 20000, 30);
		
		gameShop.sellItem(lee);
		
		System.out.println(lee.name + "의 게임머니 잔액 : " + lee.gameMoney);
		System.out.println("게임샵 아이템 잔고 : " + gameShop.itemStock);		
	}
}
