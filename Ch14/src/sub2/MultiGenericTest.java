package sub2;

/*
 * 날짜 : 2020/11/18
 * 이름 : 이슬이
 * 내용 : 제너릭 클래스 실습하기 교재 p386
 */

public class MultiGenericTest {
	public static void main(String[] args) {
		
		
		Tv tv = new Tv("LG 올레드");
		SmartPhone iphone = new SmartPhone("아이폰12");
		
		Product<Tv, Integer> p1 = new Product<>(tv, 1000000);
		Product<SmartPhone, String> p2 = new Product<>(iphone, "iphone12s");

		p1.show();
		p2.show();
		
		
	}

}
