package sub1;

/*
 * ��¥ : 2020/11/23
 * �̸� : �̽���
 * ���� : ���ٽ� �ǽ��ϱ� ���� p402
 */

public class LambdaTest {
	
	public static void main(String[] args) {
		
		// ���ٽ� : �������̽��� Ȱ���� �ڵ�ҷ��� ���� �͸��Լ�
		Lambda1 lam1 = ()->{System.out.println("Lambda1 ���ٽ� ����...");};
		
		lam1.method();
		
		Lambda2 lam2 = x->System.out.println("Lambda2 ���ٽ� �Ű����� x : "+x);		
		lam2.method(10);
		
		Lambda3 lam3 = (x, y)->x + y;
		
		int result = lam3.method(2, 3);
		System.out.println("Lambda3 ���ٽ� ��� : "+result);
		
	}
}
