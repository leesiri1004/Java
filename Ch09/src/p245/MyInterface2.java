package p245;

public interface MyInterface2 {

	public default void defaultMethod() {
		System.out.println("MyInterface2 �� default �޼���");
	}
	
	public static void staticMethod() {
		System.out.println("MyInterface2 �� static �޼���");		
	}
}
