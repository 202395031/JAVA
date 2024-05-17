/*
 * 작성일 : 2024년 05월 17일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 
 * 사용자로부터 값을 입력 받아 그 입력 값의 개수에 따라 도형의 넓이, 부피를 구하는 프로그램
 * 입력 값이 한 개이면 원의 넓이, 입력 값이 두 개이면 사각형의 넓이,
 * 입력 값이 세 개이면 육면체 부피를 계산합니다.
 * 넓이, 부피 계산하는 부분은 메소드 오버로딩으로 작성하시오.
 * 사용자가 엔터키를 누르면 입력을 종료하고,
 * 종료전에 입력한 숫자의 개수에 따라 도형의 결과 값을 출력합니다.
*/
import java.util.Scanner;

// 메소드의 매개변수 개수에 따라 넓이와 부피 계산하는 클래스.
class Overload {
	public void get_vol(int r) {
		System.out.printf("반지름이 %d인\n원의 넓이는 : %.2f\n", r, Math.PI * r * r);
	}
	public void get_vol(int w, int h) {
		System.out.printf("가로가 %d\n세로가 %d\n사각형의 넓이는 : %d\n", w, h, w*h);
	}
	public void get_vol(int w, int h, int d) {
		System.out.printf("가로가 %d\n세로가 %d\n높이가 %d인\n육면체의 넓이는 : %d\n", w, h, d, w*h*d);
	}
}
public class OverloadTest1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Overload ol = new Overload();
		while(true) {
			// 사용자로부터 한 줄을 입력받고(trim() 메서드를 사용하여 양쪽 공백을 제거한 후)
			// input 변수에 저장한다.
			// trim() 메서드를 사용하는 이유는 사용자가 입력할 때
			// 공백을 추가로 입력하는 경우를 방지하기 위함입니다.
			// 사용자가 엔터키를 눌러 입력을 종료하면 이 입력은 빈 문자열("")이 됩니다.
			System.out.println("1. 원의 경우 : 반지름의 길이");
			System.out.println("2. 직사각형의 경우 : 가로와 세로의 길이");
			System.out.println("3. 정육면체의 경우 : 가로, 세로, 높이의 길이");
			System.out.print("정수를 입력하시오.(종료:엔터) : ");
			String input = scanner.nextLine().trim();
			
			if (input.isEmpty()) {
				System.out.println("프로그램 종료");
				break;	// 엔터키가 눌렸을 때 입력 종료
			}
			
			// 입력된 문자열을 공백을 기준으로 분할하여 문자열 배열에 저장합니다.
			// "\\s+"는 정규 표현식으로, 하나 이상의 공백을 나타냅니다.
			// 따라서 입력된 문자열이 여러 개의 공백으로 구분되어 있어도 정확히 분할됩니다.
			String[] shape_len = input.split("\\s+");
			if(shape_len.length == 1) {
				ol.get_vol(Integer.parseInt(shape_len[0]));
			}
			else if(shape_len.length == 2) {
				ol.get_vol(Integer.parseInt(shape_len[0]), Integer.parseInt(shape_len[1]));
			}
			else {
				ol.get_vol(Integer.parseInt(shape_len[0]), Integer.parseInt(shape_len[1]), Integer.parseInt(shape_len[2]));
			}
 		}
		
	}

}
