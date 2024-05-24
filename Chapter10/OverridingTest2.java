/*
 * 작성일 : 2024년 05월 24일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 메소드 오버라이딩 2
 * 
 * 한정자 범위
 * public > protected > 한정자 없음
 * 
 * 메소드 오버라이딩을 할때 한정자의 범위가 상위 클래스가 하위클래스보다 작으면
 * 상속이 되지 않는다. private의 경우엔 상속이 되지 않는다.
*/
class OT2a {
	// 매개 변수가 1개인 메소드 생성.
	public void show(String str) {
		System.out.println("상위 클래스 메소드 show(String str) 수행 : " + str);
	}
}

class OT2b extends OT2a {	// 상속됨	
	// 메소드 이름이 같고 매개변수의 타입과 갯수가 같다. \\ 오버라이딩 //
	// 오버라이딩 => 상위클래스의 메소드를 재정의 한 것이다.
	public void show(String s) {
		System.out.println("하위 클래스 메소드 show(String s) 수행 : " + s);
	}
}	
public class OverridingTest2 {

	public static void main(String[] args) {
		OT2b otb = new OT2b();
		otb.show("쉽다. 자바");	// 상위 클래스의 show 메소드를 사용하지 못한다.
								// 하위 클래스에서 재정의한 show가 호출 된다.
		OT2a ota = new OT2a();
		ota.show("어렵다. 자바");	// 상위 클래스 메소드를 바로 호출
	}
}

