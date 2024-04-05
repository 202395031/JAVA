/*
 * 작성일 : 2024년 04월 02일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 정수를 입력받아 그 수의 약수를 출력하시오.
 * 
 * [문제분석]
 *	약수는 어떤 수를 나누었을 때 나누어떨어지게 하는 자연수이다.
 *	8의 약수 : 1, 2, 4, 8
 *	어떤 수를 입력 받았을때 입력받은 값만큼 반복하면서 비교를한다.
 *	입력받은 값을 반복문의 수로 나눠서 나머지가 0인 값을 출력한다.
 * 
 * [알고리즘]
 *	1. 정수를 입력받는다.
 *	2. 수는 1에서 
 *	3. 입력받은 값 만큼 반복한다.
 *		2-1 입력받은 값에서 수를 나눴을때 나머지가 0이면
 *			2-1-1. 그 수를 출력한다. 
 *		3-2 수를 1씩 증가시킨다.
 *
*/

import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력하시오. : ");
		int num = stdIn.nextInt();
		
		System.out.print(num + "의 약수는 : ");
		int i = 1;
		while(i <= num) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
}
