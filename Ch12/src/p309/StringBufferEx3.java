package p309;

public class StringBufferEx3 {

	public static void main(String[] args) {

		// ����
		long start = System.currentTimeMillis();

		@SuppressWarnings("unused")
		String str = "";
		for (int i = 0; i < 1000000; i++) {
			str += i;
		}

		// ��
		long end = System.currentTimeMillis();
		System.out.println("���� �ð� : " + (end - start) / 1000);

	}

}
