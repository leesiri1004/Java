package p175;

public class InitEx {
	
	// ������
	public InitEx() {
		System.out.println("������ ȣ��");
	}
	
	// static �ʱ�ȭ��
	static {
		System.out.println("Ŭ���� �ʱ�ȭ �� ����");
	}
	
	// �ν��Ͻ� �ʱ�ȭ ��
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ �� ����");
	}
	
	public static void main(String[] args) {
		System.out.println("main �޼������");
		System.out.println("main init1 ��ü ����");
		InitEx init1 = new InitEx();
		System.out.println("main init2 ��ü ����");
		InitEx init2 = new InitEx();
	}

}
