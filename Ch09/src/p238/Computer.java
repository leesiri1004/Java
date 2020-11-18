package p238;

public class Computer {
	
	public static void main(String[] args) {
		
		GraphicCard gc = new Amd();
		
		System.out.println("메모리 : "+GraphicCard.MEMORY);
		
		// Amd로 생성
		gc = new Amd(); // 자동 형변환
		gc.process();
		
		// Nvidia로 생성
		gc = new Nvidia(); // 자동 형변환
		gc.process();
	}

}
