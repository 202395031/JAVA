/*
 * 작성일 : 2024년 03월 15일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 변수와 자료형.
 * 
*/
public class VarDatatype {

	public static void main(String[] args) {
		// 상수 선언	
		final int MAX = 100;
		final double PI = 3.14;
		
		// PI = 3.141592; // 오류 발생 : 상수는 한번 값이 결정 되면 변할 수 없다.
		
		int r = 5;
		double pi = 3.14159;
		String name = "천승용";
		char blood = 'O';
		// AB는 char가 2byte밖에 못 넣기에 변수에 넣지 못함.
		
		System.out.println("원주율은 " + PI + "입니다.");
		System.out.println("원주율은 " + pi + "입니다.");
		
		//원의 넓이를 계산하여 출력
		
		double area = r * r * pi;
		System.out.println("반지름 " + r + "인 원의 넓이는 " + area + "입니다.");
		
		area = r * r * PI;
		System.out.printf("반지름이 %d인 원의 넓이는 %.2f입니다.\n", r, area);
		// 정수 / 정수는 결과가 정수로 된다. 아무리 변수를 만들때 double을 넣어도 실수가 되지않는다.
		// 실수 / 실수를 int 변수에 저장하게 된다면 구문 오류가 되게 된다.
		// 결과 값이 실수가 되게 만들기 위해서는 변수를 double로 지정한 후 실수 / 정수 또는 정수 /실수 실수 / 실수를 해야한다.
	}

}
