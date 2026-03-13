package classTask;
// 동물 클래스 선언

// 변수
// 이름, 나이, 체력, 먹이 개수, 먹이 종류

// 메소드
// 먹기, 산책하기

// 먹기
// 체력 1 증가, 먹이 개수 1 감소

// 산책하기
// 체력 1 감소

class Animal1 {
	String name;
	int age;
	int hp;
	int foodCount;
	String foodType;
	
	public Animal1() {;}
	
	public Animal1(String name, int age, int hp, int foodCount, String foodType) {
		this.name = name;
		this.age = age;
		this.hp = hp;
		this.foodCount = foodCount;
		this.foodType = foodType;
	}

	void eat() {
		hp++;
		foodCount--;
	}
	
	void walk() {
		hp--;
	}
}

public class ClassTask03 {
	public static void main(String[] args) {
		Animal1 dog = new Animal1("바둑이", 3, 10, 4, "사료");
		
		System.out.println(dog.name + "'s Info");
		System.out.println("나이 : " + dog.age);
		System.out.println("체력 : " + dog.hp);
		System.out.println("먹이 개수 : " + dog.foodCount);
		System.out.println("먹이 종류 : " + dog.foodType);
		
		dog.eat();
		dog.walk();
		
		System.out.println();
		
		System.out.println(dog.name + "'s Info");
		System.out.println("나이 : " + dog.age);
		System.out.println("체력 : " + dog.hp);
		System.out.println("먹이 개수 : " + dog.foodCount);
		System.out.println("먹이 종류 : " + dog.foodType);
	}
}
