package test;

public class Exercise1 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		// for���� �̿��Ͽ� �ݺ� �հ� ����
		
		for (int i=1; i<=100; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
			
		
		System.out.println("5�� ����� �հ�� "+sum);
	}

}