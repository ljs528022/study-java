package staticTest;

public class Gangnam {
	public static void main(String[] args) {
		Company han = new Company("한동석", 3000);
		Company kim = new Company("김민환", 2000);
		
		Company.totalIncome += han.income;
		Company.totalIncome += kim.income;
		
		System.out.println(Company.totalIncome);
	}
}
