package p219;

public class Lion extends Animal {

	public Lion(String type, String name) {
		super(type, name);
	}

	public void sleep() {
		System.out.println(this.name + "은(는) 숲속에서 잠을 잔다.");
	}
}
