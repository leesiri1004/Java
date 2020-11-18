package p245;

public interface MyInterface1 {
	
	public default void defaultMethod() {
		System.out.println("MyInterface1 의 default 메서드");
	}
	
	public static void staticMethod() {
		System.out.println("MyInterface1 의 static 메서드");		
	}
}
