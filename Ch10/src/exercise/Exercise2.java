package exercise;

public class Exercise2 {
	
	public static void main(String[] args) {
		
		// name�� ����ϴ� �ڵ� �ۼ�
		
		System.out.println(new Out().new In().name);
	}

}

class Out {
	class In {
		String name = "�ڹ�";
	}
}
