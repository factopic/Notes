package Date;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DayDate
{
	public static void main(String[] args) throws ParseException
	{
		String dd="05";
		String MM="05";
		String yyyy="1963";
		String xxx;
		String inputDateStr = String.format("%s/%s/%s", dd, MM ,yyyy);
		System.out.println( inputDateStr );
		java.util.Date inputDate = new SimpleDateFormat("ddd/MM/yyyy").parse(inputDateStr);
		Calendar calendar =  Calendar.getInstance();
		calendar.setTime(inputDate);
        String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        System.out.println(dayOfWeek);
	}

}
