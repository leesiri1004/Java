package p200;

public class SuperEx {
	public static void main(String[] args) {
		
		Child child = new Child();
		child.print();
	}

}

class Parent {
	int number = 3;
	
	Parent() {
		System.out.println("�θ� ��ü ����");
	}
}

class Child extends Parent {
	int number = 2; // �ּ�ó���ϸ� ����� 3���� ���
	
	public Child() {
		System.out.println("�ڽ� ��ü ����");
	}
	
	void print() {
		int number = 1;
		System.out.println(number); // �޼��� �������� number
		System.out.println(this.number); // �ڽ� ��ü�� number
		System.out.println(super.number); // �θ� ��ü�� number
	}
}