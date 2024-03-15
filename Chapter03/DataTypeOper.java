/*
 * 작성일 : 2024년 03월 15일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 연산과 자료형.
 * 		 두개의 정수를 입력받아 평균을 계산하는 프로그램
 * 
 * 		알고리즘
 * 		1. 두 정수를 입력 받는다.
 * 		2. 평균을 계산한다.
 * 		3. 평균을 출력한다.
*/

// 입력을 위한 라이브러리
import java.util.Scanner;

public class DataTypeOper {

	public static void main(String[] args) {
		// 두개의 정수를 입력 받는다.
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하시오 : ");
		int num1 = stdIn.nextInt();
		
		System.out.print("두 번째 정수를 입력하시오 : ");
		int num2 = stdIn.nextInt();
		
		double avg1 = (num1 + num2) / 2;
		
		// 논리 오류 : 실수의 값으로 나오기는 하지만 .뒤에 수는 0으로 고정되어있다.
		System.out.println("정수 연산 : " + num1 + "와(과) " + num2 + "의 평균은 " + avg1 + "이다.");
		
		double avg2 = (num1 + num2) / 2.0;
		System.out.println("실 연산 : " + num1 + "와(과) " + num2 + "의 평균은 " + avg2 + "이다.");
	}

}
