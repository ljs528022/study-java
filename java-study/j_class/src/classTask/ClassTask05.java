package classTask;


// 화면
// 부서별 매출 관리

// 회사 클래스
// 회사 번호
// 부서 이름
// 부서 매출

// 회사 1개당, 여러 부서가 있다.
// 회사는 부서별 총 매출과 평균 매출을 구할 수 있다.
public class ClassTask05 {
	public static void main(String[] args) {
		Department[] departments = {
			new Department("개발부", 4000),
			new Department("홍보부", 2000),
			new Department("전략부", 6000),
			new Department("기획부", 9000),			
		};
		
		Company samsung = new Company("samsung", departments);
		
		System.out.println(samsung.id);
		System.out.println(samsung.totalSales);
		System.out.println(samsung.avgSales);
	}

}
