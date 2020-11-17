package p235;

import p232.Fax;

public class ComplexerMain2 {
	
	public static void main(String[] args) {
		
		Fax fax = new Fax() {
			
			@Override
			public void send(String tel) {
				System.out.println("여기는 익명 구현 객체의 send()");
			}
			
			@Override
			public void recieve(String tel) {
				System.out.println("여기는 익명 구현 객체의 receive()");
			}
		};
		
		fax.send("1234");
		fax.recieve("5678");
	}

}
