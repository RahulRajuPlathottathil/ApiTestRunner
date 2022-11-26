/**
 * 
 */
package base;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author : Rahul Raju
 * Date    : 25/11/2022
 * Desc    : getDate will generate date based on certain criteria
 *         : if user need a date in future , user can add number of days to add to current date
 * Inputs  : number of days to add
 * Output  : date in string format
 * Eg:-   getDate(+5) =>  currentDate +5 days in output 
 *
 */
public class DateUtility {
	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public static String getDate(String days) {
		int dayToadd = 0;
		if (days.contains("+") || days.contains("-"))
			dayToadd = Integer.valueOf(days.replace("+", "").replace("-", ""));
		Date currentDate = new Date();
		System.out.println(dateFormat.format(currentDate));
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(currentDate);
		calendar.add(Calendar.DATE, dayToadd);
		Date currentDatePlusOne = calendar.getTime();
		System.out.println(dateFormat.format(currentDatePlusOne));
		return (dateFormat.format(currentDatePlusOne));
	}

}
