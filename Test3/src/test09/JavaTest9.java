package test09;

/*
 * ��¥ : 2020/11/19
 * �̸� : �̽���
 * ���� : �߻�Ŭ����, ������ ��������
 */

public class JavaTest9 {
	public static void main(String[] args) {
		JavaTest9 here = new JavaTest9();

		Circle circle = new Circle(); // Shape circle (������ ���� ����)
		Triangle triangle = new Triangle(); // Shape triangle (������ ���� ����)

		here.draw(circle);
		here.draw(triangle);

	}

	public void draw(Shape obj) {
		obj.draw();
	}
}