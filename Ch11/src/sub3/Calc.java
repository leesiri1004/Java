package sub3;

public class Calc {

	// �̱��� ��ü
	private static Calc instance = new Calc();

	private Calc() {
	}

	public static Calc getInstance() {
		return instance;
	}
	
	
	public int plus(int x, int y) {
		int z = x + y;
		return z;
	}

	public int minus(int x, int y) {
		int z = x - y;
		return z;
	}

	public int multi(int x, int y) {
		int z = x * y;
		return z;
	}

	public int div(int x, int y) throws Exception {
		
		if (y < 0) {
			// y�� �����϶� ���ܸ� �����ؼ� div�� ȣ���� ������ ���ܸ� ������.
			Exception e = new Exception("y�� ������� �մϴ�.");
			throw e;
		}else if (y == 1) {
			// y�� 1�ϴ� ���ܸ� �����ؼ� div�� ȣ���� ������ ���ܸ� ������.
			throw new Exception("y�� 1�� �Ǹ� �ȵ˴ϴ�.");
		}
			
		int z = x / y;
		return z;
	}

}