package p328;

import java.util.Calendar;

public class CalendarEx4 {
	
	public static void main(String[] args) {
		
		// 현재일
		int sYear = 2020;
		int sMonth = 6;
		int sDay = 12;
		
		// 이전일
		int eYear = 2020;
		int eMonth = 6;
		int eDay = 1;
		
		Calendar sCal = Calendar.getInstance();
		Calendar eCal = Calendar.getInstance();
		sCal.set(sYear, sMonth+1, sDay);
		eCal.set(eYear, eMonth+1, eDay);
		
		long diffsec = (sCal.getTimeInMillis()-eCal.getTimeInMillis())/1000;
		
		long diffday = diffsec / (24*60*60);
		
		System.out.println(diffday + "일 경과");
		
	}

}
