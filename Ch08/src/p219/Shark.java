package p219;

public class Shark extends Animal {

	public Shark(String type, String name) {
		super(type, name);
	}

	public void sleep() {
		System.out.println(this.name + "은(는) 물속에서 잠을 잔다.");
	}
}
