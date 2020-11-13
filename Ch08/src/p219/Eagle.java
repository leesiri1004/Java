package p219;

public class Eagle extends Animal {

	public Eagle(String type, String name) {
		super(type, name);
	}

	public void sleep() {
		System.out.println(this.name + "은(는) 하늘에서 잠을 잔다.");
	}
}
