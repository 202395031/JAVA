/*
 * 작성일 : 2024년 05월 24일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 메소드 오버라이딩 3
 * 
 * Source탭에 Overriding을 클릭하면 오버라이딩을 할것을 선택하면 자동으로 코드를 적어준다.
 * 
 * super = 상위 클래스의 생성자 호출 : 반드시 첫 번째 라인에 위치해야한다.
 */
class OT3a {
	// 매개 변수가 1개인 메소드 생성.
	public void show(String str) {
		System.out.println("상위 클래스 메소드 show(String str) 수행 : " + str);
	}
}
class OT3b extends OT3a {
	@Override
	public void show(String str) {
		//super.show(str);	// 상위 클래스의 메소드로 접근할때 super를 사용한다.
		System.out.println("하위 클래스 메소드 show(String str) 수행 : " + str);
	}	
}
public class OverridingTest3 {

	public static void main(String[] args) {
		OT3b otb = new OT3b();
		otb.show("오늘은 금요일");
	}

}
