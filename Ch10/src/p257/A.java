package p257;

public class A { // �ٱ� Ŭ����
	A() {// �ٱ� Ŭ������ ������
		System.out.println("A ��ü ����");
	}

	static class B { // static ���� Ŭ����
		B() { // static ���� Ŭ������ ������
			System.out.println("C ��ü ����");
		}

		int var1;
		static int var2;

		public void method1() {
			System.out.println("static ���� Ŭ������ method1()");
		}

		public static void method2() {
			System.out.println("static ���� Ŭ������ static method2()");
		}
	}

	public class C { // �ν��Ͻ� ���� Ŭ����
		C() { // �ν��Ͻ� ���� Ŭ������ ������
			System.out.println("B ��ü ����");
		}

		int var1;

		public void method1() {
			System.out.println("�ν��Ͻ� ���� Ŭ������ method1()");
		}
	}

	public void method() { // �ٱ� Ŭ������ �޼���
		class D { // ���� ���� Ŭ����
			D() {
				System.out.println("D ��ü ����");
			}

			int var1;

			public void method1() {
				System.out.println("���� ���� Ŭ������ method1()");
			}
		}

		D d = new D();
		d.var1 = 3;
		d.method1();
	}

}