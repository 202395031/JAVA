/*
 * 작성일 : 2024년 04월 05일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 조건식 연습.
 * 		 월을 입력받아 해당 계절을 출력하시오.
 * 		 3,4,5월 => 봄
 * 		 6,7,8월 => 여름
 *   	 9,10,11월 => 가을
 *   	 12,1,2월 => 겨울
 */

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		int month;
		do {
			System.out.print("월을 입력하시오 : ");
			month = stdIn.nextInt();
			switch(month)
			{
				case 3 : case 4: case 5:
					System.out.println("봄입니다.");
					break;						case 6 : case 7: case 8:				System.out.println("여름입니다.");
					break;
				case 9 : case 10: case 11:
					System.out.println("가을입니다.");
					break;
				case 12 : case 1: case 2:
					System.out.println("겨울입니다.");
					break;	
				case 0:
					System.out.println("프로그램을 종료합니다.");
					break;
				default :
					System.out.println("해당 월은 없습니다.");
					break;	
			}
		}while(month != 0);
	}
}