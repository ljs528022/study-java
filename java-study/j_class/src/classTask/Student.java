package classTask;

import java.util.Iterator;

public class Student {
	Subject[] subjects;
	int totalScore;
	double avgScore;
	
	public Student() {;}

	public Student(Subject[] subjects) {
		this.subjects = subjects;
		calculate();
	}
	
	void calculate() {
		int sum = 0;
		for (int i = 0; i < subjects.length; i++) {
			sum += subjects[i].subScore;
		}
		totalScore = sum;
		avgScore = (double)totalScore / subjects.length;
	}
	
	
	
	
}
