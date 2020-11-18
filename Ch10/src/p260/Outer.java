package p260;

public class Outer {
	
	public interface InterfaceEx {
		public void method();
	}
	
	InterfaceEx ie;
	
	public void setInterfaceEx (InterfaceEx ie) {
		this.ie = ie;
	}
	
	public void outerMethod() {
		ie.method();
	}

}
