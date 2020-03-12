/**
 * 
 */
package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Pierre
 *
 */
public class TestCalendar {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyy");
		System.out.println(form.format(date));
		
		cal.set(Calendar.HOUR, 23);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 59);
		date = cal.getTime();
		form = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(form.format(date));
		
		date = new Date();
		System.out.println(form.format(date));
		
	}

}
