package inheritanceTest;

class Animal {
	String name;
	int age;
	String feed;
	
	public Animal() {;}

	public Animal(String name, int age, String feed) {
		super();
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	
	
//	메소드 앞에 final 을 붙이면, 자식에서 재정의를 할 수 없다.
//	
	final void walk() {
		System.out.println("걷기");
	}
	
	void run() {
		System.out.println("뛰기");
	}
	
	void eat() {
		System.out.println("먹기");
	}
}	

class Lion extends Animal {
	int group;
	
	public Lion() {;}
	
	public Lion(String name, int age, String feed, int group) {
		super(name, age, feed);
		this.group = group;
	}
	
//	@Override
//	void walk() {
//		System.out.print("네 발로 ");
//		super.walk();
//	}

	void hunt() {
		System.out.println("사냥하기");
	}
}

public class InheritanceTest02 {
	public static void main(String[] args) {
		Lion Simba = new Lion("심바", 4, "염소", 3);
		
		Simba.walk();
	}
}
