package p245;

public interface MyInterface2 {

	public default void defaultMethod() {
		System.out.println("MyInterface2 의 default 메서드");
	}
	
	public static void staticMethod() {
		System.out.println("MyInterface2 의 static 메서드");		
	}
}
