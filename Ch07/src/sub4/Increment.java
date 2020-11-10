package sub4;

public class Increment {
	
	public int num1;
	public static int num2;    // static 고정/정적변수 ((메모리상황)method area에서 관리)
	
	public Increment(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		// TODO Auto-generated constructor stub
	}
	
	public Increment() {             // overloading 오버로딩
		num1++;
		num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
	
	public static void add() { // increment member method
		// 정적 메서드 (static method)에서 non-static 변수를 참조할 수 없다. (이 경우에는 num1) 
		num2++;
		
		
	}

}
