package p222;

public class FinalMethod {
	
	// ������ ������ �޼���
	public void method() {
		
	}
	
	// �����ǰ� �Ұ����� �޼���
	public final void finalMethod() { 
		
	}

}

class SubFinalMethod extends FinalMethod {
	public void method() { // ������ ����
		System.out.println("method() ������");
	}
	
	// public void finalMethod() { // ������ �Ұ�
	//	System.out.println("finalMethod() ������");
	// }
}
