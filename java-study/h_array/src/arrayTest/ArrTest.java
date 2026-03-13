package arrayTest;

public class ArrTest {
	public static void main(String[] args) {
		int[][] arrData = { {3, 4, 5}, {7, 8 ,9} };
		int rowLength = arrData.length;
		int colLength = arrData[0].length;
		int length = rowLength * colLength;
		
//		for (int i = 0; i < length; i++) {
//			System.out.println(arrData[i / 3][i % 3]);
//		}

		for (int i = 0; i < rowLength; i++) {
		// 0 1
			for (int j = 0; j < colLength; j++) {
			// 0 1 2 
				System.out.println(arrData[i][j]);
			}
		}
	}
}
