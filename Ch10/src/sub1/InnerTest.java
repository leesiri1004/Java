package sub1;

import sub1.Outer.Inner;

/*
 * 날짜 : 2020/11/16
 * 이름 : 이슬이
 * 내용 : 중첩클래스(내부) 실습하기 교재 p254
 */

public class InnerTest {
	
	public static void main(String[] args) {
		
		Outer out = new Outer(100);
		out.show();
		
		Inner inn = out.new Inner(200);
		inn.show();
	}

}
