package test;

public class Exercise1 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		// for문을 이용하여 반복 합계 연산
		
		for (int i=1; i<=100; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
			
		
		System.out.println("5의 배수의 합계는 "+sum);
	}

}
