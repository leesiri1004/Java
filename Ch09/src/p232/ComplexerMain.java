package p232;

public class ComplexerMain {
	
	public static void main(String[] args) {
		
		Complexer com = new Complexer();
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.recieve("02-8765-4321");
	}

}
