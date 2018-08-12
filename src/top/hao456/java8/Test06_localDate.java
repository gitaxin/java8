package top.hao456.java8;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Test06_localDate {

	public static void main(String[] args) {
		
		/**
		 * java8前
		 */
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("java8前:"+year+"-"+month+"-"+day);
		
		/**
		 * java8后
		 */
		LocalDate date = LocalDate.now();
		year = date.getYear();
		month = date.getMonthValue();
		day = date.getDayOfMonth();
		System.out.println("java8后:"+year+"-"+month+"-"+day);

	}

}
