package p245;

public interface MyInterface1 {
	
	public default void defaultMethod() {
		System.out.println("MyInterface1 �� default �޼���");
	}
	
	public static void staticMethod() {
		System.out.println("MyInterface1 �� static �޼���");		
	}
}
