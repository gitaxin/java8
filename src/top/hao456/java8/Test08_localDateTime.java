package top.hao456.java8;

import java.time.LocalDateTime;

public class Test08_localDateTime {
	
	public static void main(String[] args) {
		
		
		LocalDateTime dateTime = LocalDateTime.now();
		int year = dateTime.getYear();
		int month = dateTime.getMonthValue();
		int day = dateTime.getDayOfMonth();
		int hour = dateTime.getHour();
		int minute = dateTime.getMinute();
		int second = dateTime.getSecond();
		System.out.println("java8后:"+year+"年"+month+"月"+day+"日 "+hour+":"+minute+":"+second);
		System.out.println(dateTime);
	}

}
