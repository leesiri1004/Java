package test06;

/*
 * ��¥ : 2020/11/19
 * �̸� : �̽���
 * ���� : Ŭ���� ��� ��������
 */

public class JavaTest6 {

	public static void main(String[] args) {
		Landlord master = new Landlord();
		master.getMoney();
	}

}

class Rent {
	public void payment() {
		System.out.println("�Ӵ�Ḧ �޽��ϴ�.");
	}
}

class Landlord extends Rent {
	public void getMoney() {
		System.out.println("�ǹ��� �Դϴ�.");
		payment();
	}
}
