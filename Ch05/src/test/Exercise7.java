package test;

public class Exercise7 {
	public static void main(String[] args) {
		
		int count = 0;
		while (true) {
			int dice = (int)(Math.random()*6)+1;
			
			System.out.println("("+dice+")");
			count++;
			
			if (dice == 6) {
				break;
			}
		}
		
		System.out.println("ÃÑ ÁÖ»çÀ§ ±¼¸° È½¼ö´Â :"+count+"È¸");
	}

}
