/*
 * 작성일 : 2024년 05월 24일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : equals()
 */
class Box11{
	public int x;
	public int y;
	public int z;
	
	public Box11(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
public class ObjectMethodTest3 {

	public static void main(String[] args) {
		Box11 b1 = new Box11(10, 20, 30);
		Box11 b2 = new Box11(10, 20, 30);
		Box11 b3 = b2;
		System.out.println(b1.equals(b2) ? "b1과 b2는 같다." : "b1과 b2는 다르다.");	// 결과 : 다르다.(주소가 다름)
		System.out.println(b2.equals(b3) ? "b2과 b3는 같다." : "b2과 b3는 다르다.");	// 결과 : 같다. (주소가 같음)
		
		String s1 = new String("처음 시작하는 자바");
		String s2 = new String("처음 시작하는 자바");
		System.out.println(s1.equals(s2) ? "s1과 s2는 같다." : "s1과 s2는 다르다.");	// 결과 : 같다. (주소가 다름)???
																							// 얘는 매개 변수의 값을 비교함
		System.out.println(s1 == s2 ? "s1과 s2는 같다." : "s1과 s2는 다르다.");	// 결과 : 다르다 ??? 
	}

}
