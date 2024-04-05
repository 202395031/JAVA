/*
 * 작성일 : 2024년 04월 05일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 알고싶은 단을 입력 받아 구구단을 출력하시오.
 * 
 * 문제분석 : 단은 변하지 않는다.(입력받는다.)
 * 			곱하는 수는 1~9까지 1씩 증가한다.(증감) 
 * 			곱셈의 결과는 단 * 수이다.
 * 			구구단 곱셈의 과정이 하나씩 출력되어야 한다.(출력문을 반복문 안에 넣기)
 * 
 * 알고리즘 :
 * 		1. 단(정수)을 입력받는다.
 * 		2. 곱하는 수는 1부터 곱하는 수는 9까지 1씩증가하면서 반복
 * 			2-1. 구구단 출력
*/

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 1. 단을 입력받는다.
		System.out.print("알고 싶은 단 입력 : ");
		int dan = stdIn.nextInt();
	
		// 2. 곱하는 수는 1부터 곱하는 수는 9까지 1씩증가하면서 반복
		for(int su = 1; su < 10; su++) {
			// 2-1. 구구단 출력
			System.out.println(dan + "X" + su + "=" + (dan*su));
		}
	}

}
