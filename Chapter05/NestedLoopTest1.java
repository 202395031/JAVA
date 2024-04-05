/*
 * 작성일 : 2024년 04월 05일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 전체 구구단 작성하기
 * 
 * [문제분석]
 * 	단은 2~9까지
 * 	곱하는 수는 1~9까지
 * 	2단 출력
 * 	3단 출력
 *	.
 *	.
 *	.
 *	9단 출력
 * [알고리즘]
 * 	1. 단는 2부터 9까지 반복한다.(1씩 증가하면서)
 * 		1-1. 곱하는 수는 1부터 9까지 반복한다. (1씩 증가하면서)
 * 			1-2-1. 단과 곱을 곱한 값을 출력한다.
 */
public class NestedLoopTest1 {

	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("["+dan+"단 출력]");
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + "x" + su + "=" + dan*su);
			}
		}
	}

}
