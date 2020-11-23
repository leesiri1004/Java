package sub1;

/*
 * 날짜 : 2020/11/23
 * 이름 : 이슬이
 * 내용 : 람다식 실습하기 교재 p402
 */

public class LambdaTest {
	
	public static void main(String[] args) {
		
		// 람다식 : 인터페이스를 활용한 코드불럭을 갖는 익명함수
		Lambda1 lam1 = ()->{System.out.println("Lambda1 람다식 실행...");};
		
		lam1.method();
		
		Lambda2 lam2 = x->System.out.println("Lambda2 람다식 매개변수 x : "+x);		
		lam2.method(10);
		
		Lambda3 lam3 = (x, y)->x + y;
		
		int result = lam3.method(2, 3);
		System.out.println("Lambda3 람다식 결과 : "+result);
		
	}
}
