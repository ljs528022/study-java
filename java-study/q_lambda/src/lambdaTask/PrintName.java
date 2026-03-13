package lambdaTask;

@FunctionalInterface
public interface PrintName {
	// firstName과 lastName을 입력받아 String을 반환하는 메소드
	public String getFullName(String firstName, String lastName);
}
