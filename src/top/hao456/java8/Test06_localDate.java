package top.hao456.java8;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
/**
 * 一、概述
 * 	1. LocalDate类使用ISO日历表示年、月、日。
 * 	2. ISO日历是国际标准化组织用来表示日期的标准格式法
 * 二、常用方法
 * 	1. LocalDate.now()：获取系统当前日期。
 * 	2. LocalDate.of(int year, int month, int dayOfMonth)
 * 		按指定日期创建LocalDate对象。
 * 	3. getYear():返回日期中的年份，返回值为int类型。
 * 	4. getMonth():返回日期中的月份，返回值为int类型。
 * 	5. getDayOfMonth():返回月份中的日，返回值为int类型。
 * 	
 * 
 *
 */
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
		System.out.println("java8前的Calendar类:"+year+"-"+month+"-"+day);
		
		/**
		 * java8后
		 */
		LocalDate date = LocalDate.now();
		year = date.getYear();
		month = date.getMonthValue();
		day = date.getDayOfMonth();
		System.out.println("java8的LocalDate类:"+year+"-"+month+"-"+day);
		System.out.println("java8的LocalDate类的toString方法："+date);
		
		/**
		 *  java8前获取的月份从0开始，java8的LocalDate获取的月份从1开始
		 */
	}

}
