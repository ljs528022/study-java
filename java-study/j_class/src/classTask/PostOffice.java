package classTask;

public class PostOffice {
	final static int PERPRICE = 1000;

	public PostOffice() {;}
	
	int getPrice(Box[] arBox) {
		int total = 0;
		for (int i = 0; i < arBox.length; i++) {
			total += arBox[i].weight * PERPRICE;
		}
		
		return total;
	}
}
