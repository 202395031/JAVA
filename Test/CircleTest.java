/*
 * 작성일 : 2024년 05월 31일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : Circle 클래스를 작성하시오.
 * 
 * [문제]:Shape 클래스를 작성하고 이를 상속받는 Circle 클래스를 작성하세요
 *   	Shape 클래스에는 String color 속성을 추가하고 
 *   	이를 설정하는 생성자를 작성입니다.  
 *   	Circle 클래스는 Shape 클래스를 상속받고, 
 *   	double radius 속성을 추가하여 
 *   	이를 설정하는 생성자를 작성합니다.  
 *   	Circle 클래스에 인의 면적과 들레를 계산하는 메소드를 작성합니다.  
 *   	사용자로부터 인의 반지름과 색상을 입력받아. 
 *   	해당 원의 정보를 출력하는 프로그램을 작성하세요.
 *   
 * [출력결과]
 * 	원의 색상을 입력하세요 : 빨강
 */

import java.util.Scanner;

class Shape {
	public String color;
	public Shape(String color) {
		this.color = color;
	}
}

class Circle extends Shape {
	private double radius;
	public Circle(double radius, String color) {
		super(color);
		this.radius = radius;
		System.out.println("원의 색상 : " + color);
		System.out.println("원의 반지름: " + radius);
	}
	
	public void circumference() {
		System.out.println("원의 둘레 : " + 2 * Math.PI * radius);
	}
	public void Area() {
		System.out.println("원의 넓이 : " + Math.PI * radius * radius);
	}
}
public class CircleTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("원의 색상을 입력하세요 : ");
		String color = stdIn.next();
		System.out.print("반지름을 입력하세요 : ");
		double radius = stdIn.nextDouble();
		
		Circle circle = new Circle(radius, color);
		
		circle.Area();
		circle.circumference();
	}

}
