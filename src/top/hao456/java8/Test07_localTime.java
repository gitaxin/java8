package top.hao456.java8;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Test07_localTime {

	
	public static void main(String[] args) {
		
		
		/**
		 * java8前
		 */
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		System.out.println("java8前:"+hour+":"+minute+":"+second);
		
		
		
		
		/**
		 * java8后 LocalTime
		 */
		LocalTime localTime = LocalTime.now();
		hour = localTime.getHour();
		minute = localTime.getMinute();
		second = localTime.getSecond();
		System.out.println("java8后:"+hour+":"+minute+":"+second);
		System.out.println(localTime);
		localTime = localTime.of(17, 22, 50);
		
		hour = localTime.getHour();
		minute = localTime.getMinute();
		second = localTime.getSecond();
		System.out.println("java8后:"+hour+":"+minute+":"+second);
		
		LocalTime localTime2 = LocalTime.of(22, 55, 46);
		System.out.println(localTime2);
		
	}
	
}
