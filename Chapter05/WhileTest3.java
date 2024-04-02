/*
 * 작성일 : 2024년 04월 02일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 정수를 입력 받아 정수의 팩토리얼 값을 출력하시오.
 * 
 * 문제분석 :	팩토리얼 예) 4!일경우 4x3x2x1 의 값임
 * 			팩토리얼 = 팩토리얼 * 수
 * 			팩토리얼에서 수는 1씩 감소한다.
 * 			정수를 입력 받음
 * 			sum 의 초기값을 1 으로 지정한다.
 * 			반복문 조건은 입력받은 수에서 1까지 감소 할거임
 * 			반복문 안에는 fac에 입력받은 값을 곱한다.
 * 
 * 알고리즘 :
 *		1. 정수를 입력받는다.
 *		2. fac = 1값을 지정한다.
 *		3. 입력받은 값에서
 *		4. 입력받은 값이 1이 될때까지 반복한다.
 *			4-1 팩토리얼을 계산한다.
 *			4-2 입력받은 값을 1씩 줄인다.
 *		5. fac 출력
*/

import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		// Scanner 객체생성
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 정수를 입력받는다.
		System.out.print("정수를 입력하시오. : ");
		int num = stdIn.nextInt();
		
		// 2. fac의 초기값 생성
		int fac = 1;
		
		// 출력문에 4!처럼 나오게 하기위한 print
		System.out.print(num);
		
		// 3. 입력받은 값에서	(조건식)
		// 4. 입력받은 값이 1이 될때까지 반복한다.
		while(num > 0) {
			// 4-1 fac에 num을 곱한다.
			fac = fac * num;
			// 4-2 입력받은 값을 1씩 감소 시킨다.	(증감식)
			num--;
		}
		// 5. fac(결과값)을 출력한다.
		System.out.println("!의 값은 : " + fac);
	}

}
