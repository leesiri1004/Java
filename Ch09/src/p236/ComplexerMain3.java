package p236;

public class ComplexerMain3 {
	
	public static void main(String[] args) {
		
		ComplexerInterface ci = new ComplexerInterface() {
			
			@Override
			public void send(String tel) {
				System.out.println("����� �͸� ���� ��ü�� send()");
			}
			
			@Override
			public void recieve(String tel) {
				System.out.println("����� �͸� ���� ��ü�� receive()");
			}
			
			@Override
			public void scan() {
				System.out.println("����� �͸� ���� ��ü�� scan()");
			}
			
			@Override
			public void print() {
				System.out.println("����� �͸� ���� ��ü�� print()");
			}
		};
		
		ci.send("1234");
		ci.recieve("5678");
		ci.print();
		ci.scan();
	}

}
