package p222;

public class FinalMethod {
	
	// 재정의 가능한 메서드
	public void method() {
		
	}
	
	// 재정의가 불가능한 메서드
	public final void finalMethod() { 
		
	}

}

class SubFinalMethod extends FinalMethod {
	public void method() { // 재정의 가능
		System.out.println("method() 재정의");
	}
	
	// public void finalMethod() { // 재정의 불가
	//	System.out.println("finalMethod() 재정의");
	// }
}
