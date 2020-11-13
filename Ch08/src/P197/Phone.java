package P197;

public class Phone {
	
	String name; // public 선언이 생략된 상황 - 생략해도 되지만 public을 선언하는 것이 좋다
	String color;
	String company;
	
	void call() {
		System.out.println("전화를 건다.");
	}

	void receive() {
		System.out.println("전화를 받다.");
	}
}
