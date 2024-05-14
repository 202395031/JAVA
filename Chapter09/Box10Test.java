/*
 * 작성일 : 2024년 05월 14일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 메소드
*/
class Box10 {
	private int width;	// private 로 객체 변수 선언.
	private int height;	
	private int depth;
	private int vol;
	private long idNum;
	
	// 클래스 변수. static 으로 정의
	private static long boxID = 0;
	
	public Box10(int width, int height, int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
		idNum = ++boxID;
		
		volume();	// 메소드 호출.
	}
	
	private void volume() {
		vol = width * height * depth;
	}
	
	public String getvolume() {
		return idNum + "번 박스의 부피 : " + vol;
	}
	
	// 클래스 메소드에는 클래스 변수와 지역변수만 사용가능하다.
	public static long getCurrentID() {
		// return idNum;	// 객체 변수 사용하면 오류 발생.
		return boxID;	// 클래스 변수 사용.
	}
}
public class Box10Test {
	public static void main(String[] args) {
		Box10 mybox1;
		for (int i = 1; i <= 5; i++) {
			mybox1 = new Box10(i, i+1, i+2);
			System.out.println(mybox1.getvolume());
		}
													// 클래스 메소드는 클래스명으로 호출 가능
		System.out.println("마지막 생성된 박스 번호는 " + Box10.getCurrentID() + "번 입니다.");
		
		// 클래스 변수는 클래스 명으로 접근한다.
		// private로 선언되어 있을때에는 접근이 불가능하다.
		//System.out.println(Box10.boxID);
	}
}