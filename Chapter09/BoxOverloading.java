/*
 * 작성일 : 2024년 05월 10일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 생성자 활용
*/
import java.util.Scanner;

// 박스의 부피를 계산하는 클래스이다.
class Box5 {
	int width;	
	int height;
	int depth;
	
	double dwidth, dheight, ddepth;
	
	public Box5() {
		width = 10;
		height = 20;
		depth = 30;
	}
	
	public Box5(int w) {
		width = w;
		height = 1;
		depth = 1;
	}
	
	public Box5(int w, int h) {
		width = w;
		height = h;
		depth = 1;
	}
	
	public Box5(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	
	public Box5(double w, double h, double d) {
		dwidth = w;
		dheight = h;
		ddepth = d;
	}

}
public class BoxOverloading {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("가로 길이 입력 : ");
		int w = stdIn.nextInt();
		System.out.print("높이 길이 입력 : ");
		int h = stdIn.nextInt();
		System.out.print("깊이 길이 입력 : ");
		int d = stdIn.nextInt();

		Box5 mybox1 = new Box5();
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("매개변수가 없는 박스의 부피 : " + vol);
		
		Box5 mybox2 = new Box5(w);
		vol = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("매개변수가 1개인 박스의 부피는 : " + vol);
		
		Box5 mybox3 = new Box5(w, h);
		vol = mybox3.width * mybox3.height * mybox3.depth;
		System.out.println("매개변수가 2개인 박스의 부피 : " + vol);
		
		Box5 mybox4 = new Box5(w, h, d);
		vol = mybox4.width * mybox4.height * mybox4.depth;
		System.out.println("매개변수가 3개인 박스의 부피는 : " + vol);
		
		Box5 mybox5 = new Box5(10.5, 20.5, 30.5);
		double dvol = mybox1.dwidth * mybox1.dheight * mybox1.ddepth;
		System.out.println("박스의 부피(실수 매개 변수) : " + dvol);
	}

}
