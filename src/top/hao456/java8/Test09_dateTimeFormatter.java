package top.hao456.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test09_dateTimeFormatter {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter =
						DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime date = LocalDateTime.parse("2018-08-12 17:45:22", formatter);
		System.out.println(date.toString());
	}

}
