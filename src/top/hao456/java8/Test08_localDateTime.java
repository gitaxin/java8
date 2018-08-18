package top.hao456.java8;

import java.time.LocalDateTime;
/**
 * 一、概述
 * 	LocalDateTime类用于表示日期和时间。
 * 二、常用方法
 * 	1. LocalDateTime.now()：获取系统当前时间。
 * 	2. LocalDateTime.of(int year,int month,int dayOfMonth,int hour,int minute,int second):
 * 		按指定日期和时间创建LocalDateTime对象。
 * 	3. getYear():返回日期中的年份。
 * 	4. getMonth():返回日期中的月份。
 * 	5. getDayOfMonth():返回月份中的日。
 * 	6. getHour():返回小时。
 * 	7. getMinute():返回分钟.
 * 	8. getSecond():返回秒。
 * 
 * @author Administrator
 *
 */
public class Test08_localDateTime {
	
	public static void main(String[] args) {
		/**
		 * 【案例】 用LocalDateTime获取当前日期和时间。
		 */
		
		LocalDateTime dateTime = LocalDateTime.now();
		int year = dateTime.getYear();
		int month = dateTime.getMonthValue();
		int day = dateTime.getDayOfMonth();
		int hour = dateTime.getHour();
		int minute = dateTime.getMinute();
		int second = dateTime.getSecond();
		System.out.println("java8LocalDateTime类:"+year+"年"+month+"月"+day+"日 "+hour+":"+minute+":"+second);
		System.out.println("java8LocalDateTime类的toString:"+dateTime);
		
	}

}
