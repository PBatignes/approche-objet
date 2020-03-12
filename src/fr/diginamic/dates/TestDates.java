/**
 * 
 */
package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCreation;

/**
 *
 * @author Pierre
 *
 */
public class TestDates {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		date.getTime();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format.format(date));
		
		date.setHours(23);
		date.setMinutes(30);
		date.setSeconds(59);
		format = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
		System.out.println(format.format(date));
		
		date = new Date();
		System.out.println(format.format(date));
		
	}

}
