package exercise;

public class Exercise6 {
	public static void main(String[] args) {
		
		int price = 187000;
		int oman = price / 50000;
		int ilman = (price % 50000) / 10000;
		int ochun = (price % 10000) / 5000;
		int ilchun = (price % 5000) / 1000;
		
		System.out.println("5������ : "+oman+"��");
		System.out.println("1������ : "+ilman+"��");
		System.out.println("5õ���� : "+ochun+"��");
		System.out.println("1õ���� : "+ilchun+"��");
	}

}
