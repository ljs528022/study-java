package classTask;

public class Company {
	static long seq;
	long id;
	String name;
	int totalSales;
	double avgSales;
	
	Department[] departments;
	
//	static 블록
//	최초 한번만 실행
	static {
		seq = 0;
	}
	
//	초기화 블록
//	생성자가 호출될 때마다 실행
	{
		id = ++seq;
	}

	public Company() {;}

	public Company(String name, Department[] departments) {
		this.name = name;
		this.departments = departments;
		calculate();
	};
	
	void calculate() {
		for (int i = 0; i < departments.length; i++) {
			totalSales += departments[i].sales;
		}
		avgSales = (double)totalSales / departments.length;
	}
}
