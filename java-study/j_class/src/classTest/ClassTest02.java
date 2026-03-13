package classTest;

class Car {
	String brend;
	int price;
	String color;
	
	public Car() {}
	
	public Car(String brend, int price, String color) {
		this.brend = brend;
		this.price = price;
		this.color = color;
	}
	
	public Car(String brend) {
		this.brend = brend;
	}
	
	public Car(String brend, int price) {
		this.brend = brend;
		this.price = price;
	}
	
	void printInfo() {
		System.out.println(brend + ", " + price + ", " + color);
	}
}

public class ClassTest02 {
	public static void main(String[] args) {
		Car mom = new Car("Benz", 10000, "Black");
		Car daddy = new Car("BMW");
		Car myCar = new Car("Morning", 2000);
		
		mom.printInfo();
		
	}
}
