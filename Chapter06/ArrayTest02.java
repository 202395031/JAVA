/*
 * 작성일 : 2024년 04월 16일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 배열에 저장된 값중 최대값과 최소값을 출력하시오.
 * 
 * 최대값, 최소값
 * 반드시 비교대상이 필요하다.
 * {34, 23, 56, 12, 77}
 * 
 * 첫번째 값을 기준으로 비교한다. => 0번지에 저장된 값을 기준으로 한다.
 * 비교하여 큰 값은 max변수에 저장한다.
 * 작은 값은 min변수에 저장한다.
 * 
 * 비교대상이 0번지 값은 비교할 필요가 없다.
 * 반복은 1번지부터 하면 된다.
*/
public class ArrayTest02 {
	public static void main(String[] args) {
		// 배열 생성 및 초기화
		int num[] = { 57, 3, 33, 78, 56, 41, 74, 88, 29, 76 };
		// 비교 기준 설정.
		int max = num[0], min = num[0];
		
		int i;
		// 배열을 반복하면서 비교하여 최댓값, 최솟값을 찾는다.
		for (i = 1; i < num.length; i++) {
			if (num[i] > max) max = num[i];
			if (num[i] < min) min = num[i];
		}
		System.out.println("배열의 최댓값 : " + max +"\n배열의 최솟값 : " +  min);
		
		// 비교 기준 설정.
		max = num[0];
		min = num[0];
		
		// 확장된 for문
		for (int j : num) {	// num배열에 저장된 값을 차례대로 j에 저장하여 실행.
			if (j > max) max = j;
			if (j < min) min = j;
		}
		System.out.println("배열의 최댓값 : " + max +"\n배열의 최솟값 : " +  min);
	}

}
