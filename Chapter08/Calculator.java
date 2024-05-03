/*
 * 작성일 : 2024년 05월 03일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 클래스 모음
*/
// main 메소드가 있는 클래스에만 public을 붙인다.
// 다른 클래스에는 public을 붙이지 않는다.

// 더하기 빼기 클래스
class PlusMinus {
	// 속성 정의
		// 변수 생성
		int plus, minus;
		
		// 메소드(기능) 정의
		// plus 기능
		// 2개의 정수형 값을 전달받아 합계를 구한 값을 돌려준다.
		public String plus(int x, int y) {	// 메소드 이름인 plus
			plus = x + y;	// 속성 변수 plus
			return "두 수의 합은 " + plus;
		}
		
		// minus 기능
		// 2개의 정수형 값을 전달받아 빼기를 한 값을 돌려준다.
		public String minus(int x, int y) {
			minus = x - y;
			return "두 수의 차는 " + minus;
		}
}

// 곱하기 나누기 클래스
// 기능 : 더하기 빼기 나누기 곱하기 기능을 다 가지고 있다.
class MultiDiv extends PlusMinus{
	// 속성 정의
		int multi;
		double div;
		
		// multi 기능(메소드)정의
		public String multi(int x, int y) {
			multi = x * y;
			return "두 수의 곱은 " + multi;
		}
		
		// div 기능(메소드)정의
		// private : 접근 금지(캡슐화)
		private String div(int x, int y) {
			div = x / y;
			return "두 수를 나눈 값은 " + div;
		}
}

public class Calculator {
	public static void main(String[] args) {
		// PlusMinus 클래스로부터 객체 생성.
		PlusMinus pm = new PlusMinus();	// +,-
		// pm(변수 이름임)은 클래스로 가기 위한 통로 
		
		// MultiDiv 클래스로부터 객체 생성.
		MultiDiv md = new MultiDiv();	// +,-,*,/
		
		// 변수 선언
		String sum, cha, multi, div;
		
		// pm객체를 통해 PlusMinus 클래스에 있는 메소드 호출
		sum = pm.plus(10, 20);
		System.out.println(sum);
		
		// pm 객체를 통해서 minus 메소드 호출하여 결과
		cha = pm.minus(10, 20);
		System.out.println(cha);
		
		// md 객체를 통해서 MultiDiv 크래스에 있는 메소드 호출
		multi = md.multi(10, 20);
		System.out.println(multi);
		
		// md 객체를 통해서 더하기 결과 호출
		// 상속 받아 사용하기에 plus 메소드 접근 가능.
		// 메세지가 요그하는 메소드가 자신의 클래스에 없으면
		// 상위 클래스에서 메소드를 찾는다.
		sum = md.plus(10, 20);
		System.out.println(sum);
		
		// md 객체를 통해서 div 메소드 호출
		// div 메소드가 private로 선언되어 접근 금지.
//		div = md.div(5, 2);	// 오류 생성
//		System.out.println(div);
	}
}
