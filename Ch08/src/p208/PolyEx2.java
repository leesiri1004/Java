package p208;

import p206.Parent;
import p207.Child;

public class PolyEx2 {
	public static void main(String[] args) {
		
		Parent p = new Child();
		p.run();
		
		// 자식클래스의 자료형으로 변환 (강제형변환)
		Child c = (Child)p;
		c.eat();
				
	}

}
