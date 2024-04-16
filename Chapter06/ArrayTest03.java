/*
 * 작성일 : 2024년 04월 16일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 1차원 배열에 정수 값을 저장하여 생성하시오.
 * 		사용자로부터 정수를 하나 입력받아 그 정수가 어디에 몇개 있는지 출력하시오,
 * 		입력한 값이 배열에 없다면 "입력한 값이 없습니다."를 출력하시오.
 * 
 * [문제분석]
 * 	배열을 총 15개를 넣는다.
 * 	사용자가 입력한 값이랑 배열에 0번지부터 끝번지 까지 비교하여 같은 걸 찾음
 * 	같은게 있을때마다 "몇번지에 있습니다."출력 개수를 샌다.
 * 	비교를 끝낸후 총 몇개가 있었는지 출력한다.
 * 
 * [알고리즘]
 * 	1. 배열을 생성한다.	(배열에 저장된 값 출력)
 * 	2. 정수를 입력받는다.(한자리수만)	 
 * 	3. 수를 샐 변수 생성(count)
 * 	4. 0부터 배열의 크기까지 반복한다.
 * 		4-1 만약 입력받은 수와 배열의[i]번지의 값이 같다면
 * 			4-1-1 "i번지에 있습니다." 출력
 * 			4-1-2 count에 1++
 * 	5. 만약 count 가 0이라면
 * 		5-1 "입력하신 정수는 배열에 없습니다." 출력
 *  6. 아니면 
 *  	6-1 count 출력
*/

import java.util.Scanner;

public class ArrayTest03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 배열을 생성한다.	(배열에 저장된 값 출력)
		int[] array = {5, 3, 2, 5, 1, 5, 5, 7, 3, 3, 7, 5, 9, 1, 8};
		System.out.println("[배열에 저장된 값 출력]");
		System.out.print("[ ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
		
		// 2. 정수를 입력받는다.(한자리수만)	 
		System.out.print("배열에서 찾을 정수를 입력하시오.(1~9): ");
		int num = stdIn.nextInt();
		
		// 3. 수를 샐 변수 생성(count)
		int count = 0;
		
		//4. 0부터 배열의 크기까지 반복한다.
		for(int i = 0; i < array.length; i++) {
			// 4-1 만약 입력받은 수와 배열의[i]번지의 값이 같다면
			if (array[i] == num) {
				// 4-1-1 "i번지에 있습니다." 출력
				System.out.println("입력한 정수 " + num + "은 " + i + "번지에 있습니다.");
				// 4-1-2 count에 1++
				count++;
			}
		}
		
		// 5. 만약 count 가 0이라면
		if (count == 0) 
			// 5-1 "입력하신 정수는 배열에 없습니다." 출력
			System.out.println("입력한 정수는 배열에 없습니다.");
		// 6. 아니면 
		else 
			// 6-1 count 출력
			System.out.println("입력한 정수는 배열에 총 " + count + "개 있습니다.");
	}

}
