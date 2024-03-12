/*
 * 작성일 : 2024년 03월 12일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 이름, 나이, 몸무게를 입력 받아 출력하기.
 */
// 라이브러리 포함.
import java.util.Scanner;

public class KeyInput2 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		// 이름, 나이, 몸무게 한번에 입력받기 => 스페이스바로 구분
		System.out.print("이름과 나이, 몸무게를 입력하세요.(스페이스바로 구분) : ");
		
		// 이름(문자열)을 입력받아 변수에 저장.
		String name = stdIn.next();
		
		// 나이(정수)를 입력받아 변수에 저장.
		int age = stdIn.nextInt();
		
		// 몸무게(실수)를 입력받아 변수에 저장.
		double weight = stdIn.nextDouble();
		
		// 출력
		System.out.print(name + "님의 나이는 " + age + "이고, ");
		System.out.println("몸무게는 " + weight + "kg입니다.");
	}
}