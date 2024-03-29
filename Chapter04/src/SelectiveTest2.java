/*
 * 작성일 : 2024년 03월 29일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 두 정수를 입력받아 두 수가 모두 짝수이면 더한 결과를 출력하고,
 * 		 그렇지 않고 두 수중 하나라도 홀수이면 몇 번째 입력한 수를 짝수로
 * 		 입력해야 하는지 출력하시오.
 * 		 
 * [문제분석]
 * 	짝수는 2로 나눈 나머지가 0이다.
 * 	홀수는 2로 나눈 나머지가 1이다.(0이 아님)
 * 	두 정수(입력받은)가 둘다 짝수(2로 나눴을때 나머지가 0)여야함
 * 	두 수 중 하나라도 홀수이면 몇 번재 입력한 수가 짝수로 바꿔야하는지 출력해야함
 * 	두 정수가 다 홀수 일때도 있음
 * 	경우의 수 (홀,홀 | 홀,짝 | 짝,홀 | 짝,짝)
 * 	
 * [알고리즘]
 * 	1. 두 수를 입력받는다.(num1, num2)
 *	2. 만약 두 수가 짝수이면
 *		2-1 두 수를 합한값을 출력
 *	3. 아니면
 *		3-1 처음 입력받은 정수가 홀수이면
 *			3-1-1 두번재 입력받은 정수가 홀수이면
 *				3-1-1-1 처음과 두번째 정수를 짝수로 바꿔야합니다. 출력
 *			3-1-2 아니면
 *				3-1-2-1 첫번째 수를 짝수로 바꿔야합니다. 출력
 *		3-2 아니면
 *			3-2-1 두번째 입력한 정수를 짝수로 바꿔야합니다. 출력	
 */

import java.util.Scanner;

public class SelectiveTest2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("[짝수만 더하는 프로그램]");
		
		System.out.print("첫번재 정수를 입력하시오. : ");
		int num1 = stdIn.nextInt();
		System.out.print("두번재 정수를 입력하시오. : ");
		int num2 = stdIn.nextInt();
		
		if(num1 % 2 == 0 && num2 % 2 == 0) {
			System.out.println("두 수의 합은 : " + (num1 + num2));
		}
		else { 
			if(num1 % 2 == 1) {
				if(num2 % 2 == 1) {
					System.out.println("두 수를 모두 짝수로 바꿔야합니다.");
				}
				else {
					System.out.println("첫 번째 정수를 짝수로 바꿔야합니다.");
				}
			}
			else {
				System.out.println("두 번째 정수를 짝수로 바꿔야합니다.");
			}
		}
	}
}
