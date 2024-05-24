/*
 * 작성일 : 2024년 05월 24일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 예약어 super1
 * super = 상위 클래스의 생성자 호출 : 반드시 첫 번째 라인에 위치해야한다.
 */
class ST1a{
	public int x = 500;
	public int y = 1000;
}

class ST1b extends ST1a {
	public String x = "처음 시작하는 자바";
	public String xx = x + super.x;			// 상위 클래스의 멤버 변수 x에 접근
	public String yy = y + " " + super.y;	// 상위 클래스의 멤버 변수 y에 접근
							// y == super.y
	// x, xx, yy, 상속받은 y, 
	// 상위 클래스 x는 없다. 그래서 super를 통해 상위 클래스 x에 접근한다.
}
public class SuperTest1 {

	public static void main(String[] args) {
		ST1b sb2 = new ST1b();
		System.out.println("객체 sb2에 들어 있는 x,y 값 : " + sb2.x + sb2.y);
		System.out.println("객체 sb2에 들어 있는 xx 값 : " + sb2.xx);
		System.out.println("객체 sb2에 들어 있는 y 값 : " + sb2.yy);
	}

}
