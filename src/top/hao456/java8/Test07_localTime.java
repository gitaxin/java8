package top.hao456.java8;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;


/**
 * 一、概述：
 * 	LocalTime类表示一天中的时间
 * 二、常用方法：
 *	1. LocalTime.now(): 静态方法，获取系统当前时间。
 *	2. LocalTime.of(int hour, int minute, int second)
 *		按指定时间创建LocalTime对象。
 *	3. getHour():返回小时.
 *	4. getMinute():返回分钟。
 *	5. getSecond():返回秒。
 */


public class Test07_localTime {

	/**
	 * 【案例】用LocalTime获取当前时间
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		/**
		 * java8前的Calendar
		 */
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		System.out.println("java8前的Calendar类:"+hour+":"+minute+":"+second);
		
		
		
		
		/**
		 * java8的 LocalTime类
		 */
		LocalTime localTime = LocalTime.now();
		hour = localTime.getHour();
		minute = localTime.getMinute();
		second = localTime.getSecond();
		System.out.println("java8的LocalTime类:"+hour+":"+minute+":"+second);
		System.out.println("LocalTime的toString方法："+localTime.toString());
		
		LocalTime localTime2 = localTime.of(12, 12,12);//指定时间
		hour = localTime2.getHour();
		minute = localTime2.getMinute();
		second = localTime2.getSecond();
		System.out.println("指定时间的LocalTime:"+hour+":"+minute+":"+second);
		System.out.println(localTime2.toString());
		
	}
	
}
