package p238;

public class Computer {
	
	public static void main(String[] args) {
		
		GraphicCard gc = new Amd();
		
		System.out.println("�޸� : "+GraphicCard.MEMORY);
		
		// Amd�� ����
		gc = new Amd(); // �ڵ� ����ȯ
		gc.process();
		
		// Nvidia�� ����
		gc = new Nvidia(); // �ڵ� ����ȯ
		gc.process();
	}

}
