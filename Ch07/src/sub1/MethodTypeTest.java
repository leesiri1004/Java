package sub1;

/*
 * ��¥ : 2020/11/05
 * �̸� : �̽���
 * ���� : �޼��� ����Ÿ�� �ǽ��ϱ� ���� p155
 */

public class MethodTypeTest {
	public static void main(String[] args) {
	
		double rs1 = type1(1.01);
		System.out.println("rs1 : "+rs1);
		
		type2(true);
		type2(false);

		boolean rs2 = type3();
		System.out.println("rs2 : "+rs2);
		
		type4();
		
		// ��������
		for(int i=2; i<=9; i++) {
			gugudan(i);
		}
		
	} // main ��
	
	// type1 : �Ű����� O, ���ϰ� O
	public static double type1(double a){
		double result = a + 3.14;
		return result;
	}
	
	// type2 : �Ű����� O, ���ϰ� X
	public static void type2(boolean isOk){
		if(isOk) {
			System.out.println("�� �Դϴ�.");
		}else {
			System.out.println("���� �Դϴ�.");
		}
	}
	
	// type3 : �Ű����� X, ���ϰ� O
	public static boolean type3(){
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
	}
	
	// type4 : �Ű����� X, ���ϰ� X
	public static void type4(){
		System.out.println("type4 �޼��� ��� : "+type1(0.12));
	}
	
	// �������� - ������ �޼��� ����
	public static void gugudan(int num ) {
		
		System.out.println(num+ "��");
		
		for(int i=1; i<=9 ; i++) {
			int result = num * i;
			System.out.println(num + " x " + i + " = " + result);
		}
	}
	
	
}
