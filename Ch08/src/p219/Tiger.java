package p219;

public class Tiger extends Animal {

	public Tiger(String type, String name) {
		super(type, name);
	}

	public void sleep() {
		System.out.println(this.name + "은(는) 산속에서 잠을 잔다.");
	}
}
