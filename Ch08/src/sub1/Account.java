package sub1;

public class Account {

	// protected ���ٱ��� �������� �ڽ�Ŭ��
	// ���¼Ӽ� : �������(field)�� ������ ĸ��ȭ(private ���� + ������ ����)�� �����ؾ� �Ѵ�.
	protected String bank;
	protected String id;
	protected String name;
	protected int money;
	
	// ������(Constructor) : Ŭ������ ��������� �ʱ�ȭ
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// ���±�� : �ɹ��޼���
	public void deposit(int _money) {
		money += _money;
		
	}
	
	public void withdraw(int _money) {
		money -= _money;
		
	}
	public void show() {
		System.out.println("================");
		System.out.println("�����  : "+bank);
		System.out.println("���¹�ȣ : "+id);
		System.out.println("�Ա���  : "+name);
		System.out.println("�����ܾ� : "+money);
	}
	
}
