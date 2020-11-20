package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	// 동기화블럭 선언으로 스레드간 경합을 막는다.
	public synchronized void setNum() { // synchronized 동기화 블럭/메서드 - 하나의 thread만 실행할 수 있게함
		num++;
	}

}
