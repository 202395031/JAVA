/*
 * 작성일 : 2024년 05월 14일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : static 활용
*/
public class C_Main {
	int count = 10;		// 객체 변수
	static int num = 20;	// 클래스 변수
	
	// 메소드 선언
	public int sum(int x, int y) {
		return x + y;
	}
	
	// 클래스 메소드 선언
	static int mul(int x, int y) {
		return x * y;
	}
	
	// 메인 메소드 - 클래스 메소드
	public static void main(String[] args) {
		int same;	// 메인 메소드에서 선언한 지역 변수.
		
		// 반드시 클래스 변수, 지역 변수만 사용 가능하다.
		// same = count;	// count 객체 변수라서 오류가 남
		
		same = num;
		System.out.println("num = " + same);

		// 클래스 메소드가 아니어서 오류 발생한다.
		// 호출 불가능
		//same = sum(5, 5);
		
		same = mul(5, 5);
		System.out.println("mul = " + same);
	}
}
