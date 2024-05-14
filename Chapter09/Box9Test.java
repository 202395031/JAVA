/*
 * 작성일 : 2024년 05월 14일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 메소드
*/
class Box9 {
	private int width;	// private로 객체 변수 선언.
	private int height;	// 클래스 외부에서는 사용할 수 없다.
	private int depth;
	private int vol;
	
	// 생성자
	public Box9(int width, int height, int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
		
		// 메소드 호출
		volume();	// private 이어도 같은 클래스 내에서 생성자가 호출 가능.
	}
	
	// 메소드
	private void volume() {	// private 로 메소드 선언
		// vol은 private로 선언된 객체변수이지만 내부에서는 사용 가능.
		vol = width * height * depth;
	}
	
	public int getvolume() {
		return vol;
	}
}
public class Box9Test {

	public static void main(String[] args) {
		Box9 mybox1 = new Box9(10, 20, 30);
		
		// width가 private로 선언되어 객체 변수 변경이 불가능하다.
		// mybox1.width = 20;
		
		// 메소드 volume 도 private로 선언이 되있기에 객체로 바로 접근이 불가능하다. 
		//int vol1 = mybox1.volume();
		
		System.out.println("정수 박스의 부피 : " + mybox1.getvolume());
	}

}
