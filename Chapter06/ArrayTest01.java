/*
 * 작성일 : 2024년 04월 16일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 1차원 배열을 생성하고, 묵시적 초기값을 출력한다.
 * 		사용자로부터 값을 입력 받아 배열에 저장하고, 합과 평균을 출력 하시오.
*/ 

import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		int num[] = new int[5];	// 배열 선언 및 생성.
		int i;
		// 배열의 길이 출력 : .length
System.out.println("배열의 길이 : " + num.length);
		
		System.out.println("배열에 저장된 초기값");
		
		// for 안에 선언한 i는 선언한곳에서 밖에 못쓴다.
		for(i = 0; i < num.length; i++) {
			System.out.println("num에 " + i + "번지값 : " + num[i]);
		}
		
		// 사용자로부터 값을 입력 받아 배열에 저장
		Scanner stdIn = new Scanner(System.in);
		System.out.println("\n사용자로부터 값을 입력 받아 배열에 저장");
		
		int sum = 0;
		
		for(i = 0; i < num.length; i++) {
			System.out.printf("%d번지에 들어갈 값을 입력하시오. : ", i);
			num[i] = stdIn.nextInt();
			sum += num[i];
		}
		
		// 배열에 저장된 값 출력
		System.out.println("\n배열에 저장된 값 출력");
		for(i = 0; i < num.length; i++) {
			System.out.println("num에 " + i + "번지값 : " + num[i]);
		}
		
		// 배열에 저장된 값들의 합과 총점 계선하여 출력
		System.out.println("\n입력 한 배열에 합 : " + sum + "\n입력 한 배열의 평균 : " + (double)sum/num.length);
	}
}
