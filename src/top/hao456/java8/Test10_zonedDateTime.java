package top.hao456.java8;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Test10_zonedDateTime {
	
	public static void main(String[] args) {
		ZonedDateTime now = ZonedDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm:ss");
		String strDate = now.format(formatter);
		System.out.println(strDate);
		now = now.plusDays(20);
		String strDate2 = now.format(formatter);
		System.out.println(strDate2);
		
		
	}

}
