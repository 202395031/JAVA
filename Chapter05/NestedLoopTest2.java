/*
 * 작성일 : 2024년 04월 05일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 별 생성
 * 
 * [문제분석]
 * 	정수를 입력받아야함
 * 	반복문 안에 반복문으로 생성
 *  출력 예)
 *  *
 *  * *
 *  * * *
 *  * * * *
 * [알고리즘]
 * 	1. 정수를 입력받는다.
 * 	2. 수는 1에서 부터 입력받은수까지 1씩증가하며 반복
 * 		2-1. 수는 1에서 부터 위에 수까지 1씩 증가하며 반복
 * 			2-1-1. 별을 출력
 * 		2-2. 빈칸을 출력
*/

import java.util.Scanner;

public class NestedLoopTest2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력하시오. : ");
		int num = stdIn.nextInt();
		
		for(int i = 1; i < num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
