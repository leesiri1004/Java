package sub1;

// ��øŬ����
public class Outer {

	private int x;

	public Outer(int x) {
		this.x = x;
	}

	public void show() {
		System.out.println("Outer x : " + x);
	}

	// ����Ŭ����
	public class Inner {
		private int x;

		public Inner(int x) {
			this.x = x;
		}

		public void show() {
			System.out.println("Inner x : " + x);
		}
	}
}