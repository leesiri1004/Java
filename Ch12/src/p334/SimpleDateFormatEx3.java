package p334;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx3 {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = "2020-06-13";
		
		Date d = null;
		try {
			d = sdf.parse(strDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(d);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd Eø‰¿œ");
		System.out.println(sdf2.format(d));
		
	}

}
