package sub2;

/*
 * ��¥ : 2020/11/09
 * �̸� : �̽���
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ� ���� p140
 */

public class ClassTest {
	public static void main(String[] args) {
		
		// �������� ��ü(Instance)���� �� �ʱ�ȭ
		Account kb = new Account("��������", "121-11-1234", "������", 10000);
		
		// �������� ��ü Ȱ���ϱ�
		kb.deposit(15000);
		
		// ĸ��ȭ �������� ����ڵ� ����
		// kb.money++;
		
		kb.withdraw(5000);
		kb.show();
		
		
		// �츮���� ��ü���� �� �ʱ�ȭ
		Account wr = new Account("�츮����", "121-12-1234", "������", 5000);
		
		// �츮���� ��ü Ȱ���ϱ�
		wr.deposit(10000);
		wr.withdraw(7000);
		
		// ĸ��ȭ �������� ����ڵ� ����
		// wr.money--;
		
		wr.show();
		
		
	}

}
