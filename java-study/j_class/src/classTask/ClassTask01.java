package classTask;

// 동물이 3마리 있다.						// 객체 3개
// 모든 동물의 이름, 나이, 성별이 있다.		// 클래스 animal 이름, 나이, 성별 필요
// 3마리 동물은 각자 자기소개를 할 수 있다.		// method '자기소개' 필요
// 클래스를 활용하여 3마리 동물이 자기소개를 할 수 있도록 구현하라.	// 객체 3개 선언하고 메소드 실행.
class Animal {
	// 받아올 값 전역변수로 선언.
	String name;
	int age;
	String gender;
	
	// 기본 생성자
	public Animal() {;}
	
	public Animal(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// 자기소개 method
	void sayMyInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
	}
}

public class ClassTask01 {
	public static void main(String[] args) {
		
		// 각각의 동물 선언
		Animal[] arAnimal = {
		            new Animal("바둑이", 5, "수컷"),
		            new Animal("호범이", 8, "암컷"),
		            new Animal("꿀돼지", 2, "암컷")
		      };
		
		// 자기소개 메소드 실행
		 for (int i = 0; i < arAnimal.length; i++) {
	         arAnimal[i].sayMyInfo();
	      }
	}
}
