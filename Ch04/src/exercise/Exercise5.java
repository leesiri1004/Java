package exercise;

public class Exercise5 {
	public static void main(String[] args) {
		
		int year = 2020;
		boolean leapYear = (year % 4 == 0 && year % 100!= 0) || year % 400 == 0;
		
		// ¿±≥‚¿Ã∏È true, ¿±≥‚¿Ã æ∆¥œ∏È false
		System.out.println(leapYear);
	}

}
