class Box6 {
	int width;	
	int height;
	int depth;
	
	double dwidth, dheight, ddepth;
	
	public Box6() {
		width = 10;
		height = 20;
		depth = 30;
	}
	
	public Box6(int w) {
		width = w;
		height = 1;
		depth = 1;
	}
	
	public Box6(int w, int h) {
		width = w;
		height = h;
		depth = 1;
	}
	
	public Box6(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	
	public Box6(double w, double h, double d) {
		dwidth = w;
		dheight = h;
		ddepth = d;
	}

}
public class BoxOverloading02 {

	public static void main(String[] args) {
		// 정수형 매개변수가 3개인 생성자 호출.
		Box6 mybox1 = new Box6(10, 20, 30);
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(정수 매개 변수) : " + vol);
		
		// 실수형 매개변수가 3개인 생성자 호출.
		mybox1 = new Box6(10.5, 20.5, 30.5);
		double dvol = mybox1.dwidth * mybox1.dheight * mybox1.ddepth;
		System.out.println("박스의 부피(실수 매개 변수) : " + dvol);
		
		// 정수형, 실수형 매개변수가 3개인 생성자 호출. => 없다.
		// 혼합되어 있는 경우 자동을 확대형으로 변환되어 수행.
		mybox1 = new Box6(10, 20, 30.5);
		dvol = mybox1.dwidth * mybox1.dheight * mybox1.ddepth;
		System.out.println("박스의 부피(정수와 실수 혼합) : " + dvol);
	}

}
