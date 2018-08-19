package top.hao456.java8;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
/**
 * 
 * 一、概述
 * 	ZonedDateTime处理日期和时间与相应的时区
 * 二、常用方法
 * 	1. ZonedDateTime.now()：	获取系统当前日期和时间。
 * 	2. String format(DateTimeFormatter formatter):
 * 		根据DateTimeFormatter对象设置的格式将日期转换为一个字符串
 *
 */
public class Test10_zonedDateTime {
	/**
	 * 【案例】将当前日期格式化为字符串并显示年、月、日、时、分和秒。
	 * 
	 */
	public static void main(String[] args) {
		ZonedDateTime now = ZonedDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm:ss");
		String strDate = now.format(formatter);
		System.out.println("format方法返回的字符串："+strDate);
		now = now.plusDays(1);//当前日期 加上1天
		String strDate2 = now.format(formatter);
		System.out.println("加上一天后的日期："+strDate2);
		
		
		
		
	}

}
