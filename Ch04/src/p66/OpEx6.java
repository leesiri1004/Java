package p66;

public class OpEx6 {
	public static void main(String[] args) {
		
		System.out.println("2:"+Integer.toBinaryString(2));
		System.out.println("3:"+Integer.toBinaryString(3));
		
		// ��Ʈ ������
		System.out.println("2&3 : "+(2 &3));
		System.out.println("2|3 : "+(2 |3));
		System.out.println("2^3 : "+(2^3));
		System.out.println("~3 : "+~3);
		
		// ù�ڸ��� ��ȣ�� ��Ÿ���� ��Ʈ�� �����Ͽ� ��� ��Ʈ�� �ݴ�� ��ȯ
		System.out.println("~3�� �������� :"+Integer.toBinaryString(~3));
		
		// ~3�� 2�������� ����
		// ù�ڸ��� ��ȣ�� ��Ÿ���� ��Ʈ ������ 31�ڸ��� �����ڷ����� �޸𸮿� ����
		System.out.println(Integer.toBinaryString(~3).length());
		
		System.out.println(Integer.MAX_VALUE); // �����ڷ����� �ִ밪 (2�� 31�� -1)
		
		System.out.println(Integer.parseInt("1111111111111111111111111111100",2)
		                   -Integer .MAX_VALUE-1 );
		
	}

}
