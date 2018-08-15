package top.hao456.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Test05_collection_doubleStream {

	public static void main(String[] args) {
		//初始化一个含有若干个Person对象的集合
		List<Person> people = createPerson();
		
		/**
		 * 【案例1】 输出集合中所有Person对象中身高最小的值。
		 */
		//创建一个Stream对象，用来 输出集合中所有Person对象中身高最小的值。
		Stream<Person> stream = people.stream();
		DoubleStream doubleStream = stream.mapToDouble(p -> p.getHeight());
		double minHeight =	doubleStream.min().getAsDouble();
		System.out.println(minHeight);// 1.65
		
		/**
		 * 【案例2】 输出集合中所有Person对象中身高最大的值。
		 */
		//创建一个Stream对象，用来输出集合中所有Person对象中身高最大的值。
		Stream<Person> stream2 = people.stream();
		DoubleStream doubleStream2 = stream2.mapToDouble(p -> p.getHeight());
		double maxHeight =	doubleStream2.max().getAsDouble();
		System.out.println(maxHeight);// 1.99
		
		
		/**
		 * 【案例3】 输出集合中所有Person对象中名字中带有"菲"字的平均身高值
		 */
		//创建一个Stream对象，用来输出集合中所有Person对象中名字中带有"菲"字的平均身高
		Stream<Person> stream3 = people.stream();
		DoubleStream doubleStream3 = stream3.filter(p -> p.getName().indexOf("菲")>-1)
				.mapToDouble(p -> p.getHeight());
		double avgHeight = 	doubleStream3.average().getAsDouble();
		System.out.println(avgHeight);// 1.665
	}
	
	//创建一个用于初始化集合的静态方法
	public static List<Person> createPerson(){
		List<Person> people = new ArrayList<Person>();
		Person person = new Person("张飞",Person.Sex.MALE,33,1.99);
		people.add(person);
		person = new Person("王菲",Person.Sex.FEMALE,33,1.65);
		people.add(person);
		person = new Person("刘亦菲",Person.Sex.FEMALE,33,1.68);
		people.add(person);
		person = new Person("李四",Person.Sex.MALE,33,1.76);
		people.add(person);
		person = new Person("小马",Person.Sex.MALE,33,1.71);
		people.add(person);
		person = new Person("郭靖",Person.Sex.MALE,33,1.88);
		people.add(person);
		return people;
	}

}
