package sub4;

public class Increment {
	
	public int num1;
	public static int num2;    // static ����/�������� ((�޸𸮻�Ȳ)method area���� ����)
	
	public Increment(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		// TODO Auto-generated constructor stub
	}
	
	public Increment() {             // overloading �����ε�
		num1++;
		num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
	
	public static void add() { // increment member method
		// ���� �޼��� (static method)���� non-static ������ ������ �� ����. (�� ��쿡�� num1) 
		num2++;
		
		
	}

}
