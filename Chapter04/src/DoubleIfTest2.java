/*
 * 작성일 : 2024년 03월 19일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 이중 if문 실습.
 * 		 하나의 정수를 입력 받아 짝수인지 홀수인지 확인하는 프로그램.
 * 
 * 문제분석 : 짝수 => 2로 나눈 나머지가 0이다.
 * 			홀수 => 2로 나눈 나머지가 1이다.	(0이 아니다.)
 * 			(if)짝수 아니면(else) 홀수이다.		
 * 			홀수 아니면 짝수이다.
 * 	
 * 알고리즘 : 1. 정수를 입력받는다.
 * 			2. 입력받은 정수가 짝수인지 판단한다.
 * 				2-1 "{}은 짝수이다." 를 출력한다.
 *			3. 아니면
 *				3-1 "{}은 홀수이다." 를 출력한다.
 *
 */

import java.util.Scanner;

public class DoubleIfTest2 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 정수를 입력 받는다.
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		
		// 2. 입력받은 정수가 짝수인지 판단한다.
		if(num % 2 == 0) {
			// 2-1 "{}은 짝수이다." 를 출력한다.
			System.out.println(num + "은(는) 짝수 입니다.");
		}
		// 3. 아니면
		else {
			// 3-1 "{}은 홀수이다." 를 출력한다.
			System.out.println(num + "은(는) 홀수 입니다.");
		}
		
		// 조건과 상관없이 무조건 출력 되는 문장.
		System.out.println("프로그램 종료");
	}

}
