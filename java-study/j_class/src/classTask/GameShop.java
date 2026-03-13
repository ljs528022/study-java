package classTask;

public class GameShop {
	String itemname;
	int itemPrice;
	int itemStock;
	
	Player player;
	
	public GameShop() {;}

	public GameShop(String itemname, int itemPrice, int itemStock) {
		this.itemname = itemname;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
	}

	void sellItem(Player player) {
		player.gameMoney -= this.itemPrice * (1 - player.discount / 100.0);
		this.itemStock--;
	}
	
	
	
	

}
