package p207;

import p206.Parent;

public class PolyEx {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.run();
		
		// �θ�Ŭ������ �ڷ������� ���� (�ڵ�����ȯ)
		Parent p = new Child();
		p.run(); // �����ǵ� �޼��尡 ����
		// p.eat(); // ����
	}

}
