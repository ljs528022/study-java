package classTask;

import java.util.Iterator;

public class User {
	static int seq;
	int id;
	String name;
	int age;
	int total;
	
	Exercise[] arExercise;
	
	static {
		seq = 0;
	}
	
	{
		id = ++seq;
	}

	public User() {;}

	public User(String name, int age, Exercise[] arExercise) {
		this.name = name;
		this.age = age;
		exercies(arExercise);
	}

	void exercies(Exercise[] exercises) {
		for (int i = 0; i < exercises.length; i++) {
			total += exercises[i].calorie;
		}
	}
}
