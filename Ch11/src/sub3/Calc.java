package sub3;

public class Calc {

	// 싱글톤 객체
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
			// y가 음수일때 예외를 생성해서 div를 호출한 쪽으로 예외를 던진다.
			Exception e = new Exception("y는 양수여야 합니다.");
			throw e;
		}else if (y == 1) {
			// y가 1일대 예외를 생성해서 div를 호출한 쪽으로 예외를 던진다.
			throw new Exception("y는 1이 되면 안됩니다.");
		}
			
		int z = x / y;
		return z;
	}

}
