package sub2;

/*
 * ��¥ : 2020/11/18
 * �̸� : �̽���
 * ���� : ���ʸ� Ŭ���� �ǽ��ϱ� ���� p386
 */

public class MultiGenericTest {
	public static void main(String[] args) {
		
		
		Tv tv = new Tv("LG �÷���");
		SmartPhone iphone = new SmartPhone("������12");
		
		Product<Tv, Integer> p1 = new Product<>(tv, 1000000);
		Product<SmartPhone, String> p2 = new Product<>(iphone, "iphone12s");

		p1.show();
		p2.show();
		
		
	}

}
