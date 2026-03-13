package arrayTest;

public class ArTest {
	public static void main(String[] args) {
//		int[] arData1 = {4, 7, 1, 2, 0};
//		
//		System.out.println(arData1);
//		System.out.println(arData1[0]);
//		System.out.println(arData1.length);
		
//		5칸 배열 선언 후, 5, 4, 3, 2, 1 넣고 출력
		int[] arData = new int[5];
		
		// 값 넣기
		for (int i = 0; i < arData.length; i++) {
			arData[i] = 5 - i;
		}
		
		// 값 출력
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
	}
}
