package ParseSoru;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeChange {
	
	public static Calendar DateChanger (String tarih) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY");
		
		Date date = sdf.parse(tarih);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		return calendar;
	}
	
	
}
