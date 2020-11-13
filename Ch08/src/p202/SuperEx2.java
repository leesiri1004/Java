package p202;

public class SuperEx2 {

}

class Parent2 {
	
	String name;
	
	public Parent2(String name) {
		this.name = name;
	}
}

class Child2 extends Parent2 {
	
	public Child2(String name) {
		super(name);
	}
	
}