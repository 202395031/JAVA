/*
 * 작성일 : 2024년 05월 07일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 원의 넓이를 구하는 프로그램을 작성하시오.
 * 		 원의 특성을 나타내는 클래스(SimpleCircle)을 정의하시오.
 * 		 클래스 변수 PI를 이용하여 원의 넓이를 구하는 프로그램을 완성하시오.
 * 
 * [문제 분석]
 * 	원의 특성인 원주율 3.14를 선언하는 클래스(PI)를 작성.
 * 	3.14는 클래스 변수로 선언. => 종단 변수로 선언.
 * 	반지름과 원주율을 가지고 원의 넓이를 계산한다.
 * 	반지름은 입력 받는다.
 * 
 * [알고리즘]
 * 	1. 클래스 선언 - SimpleCircle
 * 		1-1. 클래스 종단 변수인 원주율(PI) 선언.	(속성 정의)
 * 	
 * 	2. 메인 메소드가 있는 클래스
 * 		2-1. 반지름을 입력 받는다.
 * 		2-2. 원의 넓이를 구한다. 
 * 			=> 반지름 * 반지름 * 원주율
 * 			=> 객체를 생성한다. X
 * 			=> PI는 객체를 통해서 클래스 변수에 접근 가능하지만
 * 			=> 클래스 변수로 선언된 아이는 클래스명으로 접근한다.
*/

import java.util.Scanner;

class SimpleCircle {
	// 클래스 종단 변수 선언.
	static final double PI = 3.14;
}

public class CircleArea {

	public static void main(String[] args) {		
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 반지름 입력 받기
		System.out.print("반지름을 입력하시오. : ");
		int r = stdIn.nextInt();
		
		// 2. 원의 넓이 계산
		double area = r * r * SimpleCircle.PI;
		
		// 3. 원의 넓이 출력
		System.out.printf("반지름이 %d인 원의 넓이는 : %.2f",r , area);
	}

}
