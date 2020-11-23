package test09;

/*
 * 날짜 : 2020/11/19
 * 이름 : 이슬이
 * 내용 : 추상클래스, 다형성 연습문제
 */

public class JavaTest9 {
	public static void main(String[] args) {
		JavaTest9 here = new JavaTest9();

		Circle circle = new Circle(); // Shape circle (다형성 적용 가능)
		Triangle triangle = new Triangle(); // Shape triangle (다형성 적용 가능)

		here.draw(circle);
		here.draw(triangle);

	}

	public void draw(Shape obj) {
		obj.draw();
	}
}