package p260;

public class OuterMain {
	public static void main(String[] args) {
		
		Outer out = new Outer();
		
		out.setInterfaceEx(new InterfaceExample());
		out.outerMethod();
		out.setInterfaceEx(new InterfaceExample2());
		out.outerMethod();
	}

}
