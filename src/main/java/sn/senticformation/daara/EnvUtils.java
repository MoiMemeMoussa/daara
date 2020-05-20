package sn.senticformation.daara;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EnvUtils {

	public static Date getCurrentDate() throws ParseException {

		String dateString = Calendar.YEAR + "-" + (Calendar.MONTH) + 1 + " - " + Calendar.DAY_OF_MONTH;
		SimpleDateFormat formatter = new SimpleDateFormat();

		formatter.format("yyyy-MM-dd");

		return formatter.parse(dateString);
	}
}
