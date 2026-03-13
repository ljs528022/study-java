package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
//		1 ~ 10 까지 배열에 담고 출력
//		10 ~ 1 까지 중 짝수만 배열에 담고 출력
//		1 ~ 100 까지 배열에 담은 후 홀수만 출력
//		001.png ~ 010.png를 배열에 담고 출력
		
//		1 ~ 10 담고 출력
//		int[] arData1 = new int[10];
//		for (int i = 0; i < arData1.length; i++) {	// 1 ~ 10 순서대로 arData[]에 저장
//			arData1[i] = i + 1;
//			
//		}	
//		for (int i = 0; i < arData1.length; i++) {	// 순서대로 출력
//			System.out.println(arData1[i]);
//		}
//		
//		System.out.println("--------------------------------");
//		
////		10 ~ 1 짝수만 담고 출력
//		int[] arData2 = new int[5];
//		
//		for (int i = 0; i < arData2.length; i++) {
//			arData2[i] = (5 - i) * 2;
//		}
//		
//		for (int i = 0; i < arData2.length; i++) {
//			System.out.println(arData2[i]);
//		}
//		
//		System.out.println("--------------------------------");
//		
////		 1 ~ 100 까지 담고 홀수만 출력
//		int[] arData3 = new int[100];
//		
//		for (int i = 0; i < arData3.length; i++) {
//			arData3[i] = i + 1;
//		}
//		
//		for (int i = 0; i < arData3.length; i++) {
//			if(i % 2 == 1) {
//				System.out.println(arData3[i]);
//			}
//		}	
		
		
//		001.png ~ 010.png를 배열에 담고 출력
//		String[] arrData = new String[10];
//		
//		for (int i = 0; i < arrData.length; i++) {
//			if(i + 1 < 10) {
//				arrData[i] = "00" + (i + 1) + ".png";
//			} else {
//				arrData[i] = "0" + (i + 1) + ".png";			
//			}
//		}
//		
//		for (int i = 0; i < arrData.length; i++) {
//			System.out.println(arrData[i]);
//		}
		
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		단, 같은 수는 없다고 가정한다.
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arrData1 = new int[5];
//		int max = 0;
//		int min = 0;
//		
//		System.out.println("5개의 정수를 중복없이 입력해주세요 >> ");
//		
//		for (int i = 0; i < arrData1.length; i++) {
//			arrData1[i] = sc.nextInt();
//		}
//		
//		// 최대값 구하기
//		max = arrData1[0];
//		for (int i = 0; i < arrData1.length; i++) {
//			if(max <= arrData1[i]) {
//				max = arrData1[i];
//			}
//		}
//		
//		min = arrData1[0];
//		for (int i = 0; i < arrData1.length; i++) {
//			if(min >= arrData1[i]) {
//				min = arrData1[i];
//			}
//		}
//		
//		System.out.println("최대 값 : " + max);
//		System.out.println("최솟 값 : " + min);
		
//		사용자에게 칸수를 입력받고, 그 칸 수 만큼 정수를 다시 입력받는다.
//		입력한 정수들의 평균값을 구한다.
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int avg = 0;
//		
//		System.out.println("원하는 배열 칸 수를 입력해주세요 >> ");
//		int[] arrData = new int[sc.nextInt()];
//		
//		System.out.println("입력한 칸수 만큼 정수를 입력해주세요 >>");
//		for (int i = 0; i < arrData.length; i++) {
//			arrData[i] = sc.nextInt();
//		}
//		
//		for (int i = 0; i < arrData.length; i++) {
//			num += arrData[i]; 
//		}
//		
//		avg = num / arrData.length;
//		
//		System.out.println("저장된 배열의 평균값 : " + avg);
		
		
//		당신은 3칸 방이 있는 건물의 주인이다.
//		각 방에는 세입자가 살고 있다.
//		방마다 월세를 받아서 총 월세와 평균 월세를 구해주는 프로그램을 만들고자 한다.
//		Scanner sc = new Scanner(System.in);
//		
//		int[] monthlyRent = new int[3];
//		int totalRent = 0;
//		int avgRent = 0;
//		
//		System.out.println("각 방의 월세를 입력해주세요. (만 단위) \nex)100 200 420");
//		
//		for (int i = 0; i < monthlyRent.length; i++) {
//			monthlyRent[i] = sc.nextInt();
//		}
//		
//		for (int i = 0; i < monthlyRent.length; i++) {
//			totalRent += monthlyRent[i];
//		}
//		
//		avgRent = totalRent / monthlyRent.length;
//		
//		System.out.println("3명의 세입자의 총 월세 : " + totalRent + " 만원");
//		System.out.println("3명의 세입자의 평균 월세 : " + avgRent + " 만원");	
	}
}
