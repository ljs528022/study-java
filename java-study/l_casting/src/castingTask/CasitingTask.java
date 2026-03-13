package castingTask;

public class CasitingTask {
//	아래의 getService 메소드로 1개의 영상을 전달 받은 뒤
//	Animation과 Film일 경우만 각 서비스를 사용한다.
//	반드시 up casting과 down casting을 활용한다.
//	Film, Animation, Drama 중 어떤 영상이 들어올지 알 수 없다.
	
	public void getService(Movie movie) {
		if (movie instanceof Animation) {
			Animation ani = (Animation) movie;
			ani.printSubtitle();
		} else if (movie instanceof Film) {
			Film film = (Film) movie;
			film.shake();
		} else {
			System.out.println("해당 기능이 제공되지 않습니다");
		}
	}
	
	public static void main(String[] args) {
		CasitingTask ct = new CasitingTask();
		
		Movie[] arMovie = {
				new Animation(),
				new Film(),
				new Drama(),
		};
		
		for (int i = 0; i < arMovie.length; i++) {
			ct.getService(arMovie[i]);
		}
	}
	
}
