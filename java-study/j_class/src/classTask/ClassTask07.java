package classTask;


//회원마다 여러 종류의 운동을 한다.
//진행한 운동마다 칼로리를 기록한다.
//이 때, 회원들은 각각 운동한 총 칼로리를 계산할 수 있다.

//회원(User)
//회원번호
//이름
//나이

//운동(Exercise)
//종목명
//칼로리(정수)
public class ClassTask07 {
	public static void main(String[] args) {
//		화면
		Exercise[] arExercise = {
				new Exercise("스쿼트", 20),
				new Exercise("데드 리프트", 70),
				new Exercise("스쿼트", 20),
				new Exercise("푸쉬 업", 40),
				new Exercise("레그 업", 40),
		};
		
		User user = new User("이정식", 28, arExercise);
		
		System.out.println(user.id);
		System.out.println(user.name);
		System.out.println("오늘 태운 칼로리 : " + user.total);
	}
}
