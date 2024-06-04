/*
 * 작성일 : 2024년 05월 31일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : Student person 클래스를 작성하시오.
 *	
 *
 * [문제] : 	Person 클래스를 작성하세요 이 클래스는 다음과 같은 속성을 가집니다 
 * 			String name
 * 			Person 클래스는 다음과 같은 메소드를 가집니다 
 * 			기본 생성자: 이름을 "홍길동"으로 초기화합니다 
 * 			매개변수 생성자: 이름을 입력받아 초기화합니다 
 * 			printlnfo() 메소드: 사람의 이름을 출력합니다
 * 			Person 클래스를 상속하는 Student 클래스를 작성하세요.
 * 			이 클래스는 다음과 같은 속성을 추가로 가집니다.
 * 			String major
 * 			
 * 			Student 클래스는 다음과 같은 메소드를 가집니다.
 * 			기본생성자 : 부모 클래스의 기본 생성자를 호출하고, major를 "기계공학과"
 * 			로 초기화합니다.
 * 			매개변수 생성자 : 이름과 전공을 입력받아 초기화 합니다.
 * 			printinfo() 메소드 : 부모 클래스의 printinfo() 메소드를 호출하고, 전공을 추가로 호출 합니다.
 * 			
 * 	[출력결과]
 * 	이름을 입력하시오 : 김지연
 * 	전공을 입력하시오 : 컴퓨터 공학부
 * 
 * 	이름 : 김지연
 * 	학고 : 컴퓨터 공학부
 */

import java.util.Scanner;

class Person {
	public String name;
	public Person() {
		name = "홍길동";
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
	}
}

class Student extends Person {
	public String major;
	public Student() {
		super();
		major = "기계공학과";
	}
	
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("학과 : " + major);
	}
}
public class StudentPerson {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("이름을 입력하시오. : ");
		String name = stdIn.next();
		System.out.print("전공을 입력하시오. : ");
		String major = stdIn.next();
		
		Student student = new Student(name, major);
		
		student.printInfo();
	}

}
