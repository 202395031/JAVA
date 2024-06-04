/*
 * 작성일 : 2024년 05월 31일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : square 클래스를 작성하시오.
 * 
 * [문제분석] : Rectangle 클래스를 작성하고 
 * 			이를 상속받는 Square 클래스를 작성하세요.
 * 			Rectangle 클래스에는 double width와 
 * 			double height 속성을 추가하고. 
 * 			이를 설정하는 생성자를 작성합니다 
 * 
 * 			Square 클래스는 Rectangle 클래스를 상속받고. 
 * 			변의 길이를 설정하는 생성자를 작성합니다 
 * 			Square 클래스에 면적과 둘레를 계산하는 메소드를 추가합니다
 * 
 * 			사용자로부터 정사각형의 변의 길이를 입력받아. 
 * 			해당 정사각형의 정보를 출력하는 프로그램을 작성하세요
 * 
 * [출력결과]
 * 	도형의 길이를 입력하세요.(입력 종료는 enter입니다.) : 
 * 	2
 * 	3
 * 
 * 	직사각형의 넓이 : 6.0
 * 	직사각형의 둘레 : 10.0
 */

import java.util.Scanner;

class Rectangle {
	public double width;
	public double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
}

class Square extends Rectangle {
	public Square(double width, double height) {
		super(width, height);
	}
	
	public void Round() {
		System.out.println("직사각형의 둘레 : " + (2 * super.width + 2 * super.height));
	}
	
	public void Area() {
		System.out.println("직사각형의 넓이 : " + super.width * super.height);
	}
}
public class SquareTest {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("도형의 길이를 입력하세요.(입력 종료는 enter입니다.) : ");
		double width = stdIn.nextDouble();
		double height = stdIn.nextDouble();
		
		Square sq = new Square(width, height);
		
		sq.Area();
		sq.Round();
	}

}
