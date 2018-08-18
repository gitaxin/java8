package top.hao456.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * 一、概述
 * 	DateTimeFormatter类用于将字符串解析为日期对象
 * 二、常用方法
 * 	1. static ofPattern(String pattern):静态方法，根据指定的字符串设定的格式，将返回一个DateTimeFormatter对象。
 * 	2. LocalDateTime.parse(strDate,formatter);静态方法，此方法将指定的字符串strDate,按DateTimeFormatter对象的字符串格式解析为一个LocalDateTime对象。
 * 	3. format(formatter):此方法属于LocalDateTime类的方法。用于将LocalDateTime对象按照DateTimeFormatter指定的格式，转换为一个字符串对象。
 *
 */
public class Test09_dateTimeFormatter {
	/**
	 * 【案例】将字符串"2018-08-18 22:30:22"解析为一个LocalDateTime对象
	 * @param args
	 */
	public static void main(String[] args) {
		
		DateTimeFormatter formatter =
						DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		//将字符串按照DateTimeFormatter对象指定的格式解析为LocalDateTime对象
		LocalDateTime date = LocalDateTime.parse("2018-08-18 22:30:22", formatter);
		System.out.println(date.toString());
		
		//将LocalDateTime对象按照DateTimeFormatter指定的格式转换为字符串输出
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd_HH/mm/ss");
		String str = date.format(formatter);
		System.out.println(str);
		
		
		
	}

}
