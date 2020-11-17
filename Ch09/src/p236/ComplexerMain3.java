package p236;

public class ComplexerMain3 {
	
	public static void main(String[] args) {
		
		ComplexerInterface ci = new ComplexerInterface() {
			
			@Override
			public void send(String tel) {
				System.out.println("여기는 익명 구현 개체의 send()");
			}
			
			@Override
			public void recieve(String tel) {
				System.out.println("여기는 익명 구현 개체의 receive()");
			}
			
			@Override
			public void scan() {
				System.out.println("여기는 익명 구현 개체의 scan()");
			}
			
			@Override
			public void print() {
				System.out.println("여기는 익명 구현 개체의 print()");
			}
		};
		
		ci.send("1234");
		ci.recieve("5678");
		ci.print();
		ci.scan();
	}

}
