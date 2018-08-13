package top.hao456.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/**
 * 
 * 一、什么是Stream
 * 	1. Stream在Java8中被定义为泛型接口
 * 	2. Stream接口代表数据流：此数据流并非我们所熟知的I/O流
 * 	3. Stream不是一个数据结构，不直接存储数据。
 * 	4. Stream通过管道操作数据。
 * 	5. 创建Stream接口实现类对象：
 * 		stream():创建一个Stream接口实现类的对象。
 * 	例如：
 * 		Stream<Person> stream = people.stream();
 * 		其中people是一个ArrayList集合，调用其中的stream()方法，返回一个Stream对象
 * 
 *二、 什么是管道
 *	1. 管道：代表一个操作序列。
 *	2. 管道包含以下组件：
 *		a. 数据集：可能是集合、数组等。
 *		b. 零个或多个中间业务。如过滤器
 *		c. 一个终端操作，如forEach
 *三、什么是过滤器
 *	1. 过滤器：用给定的条件在源数据基础上过滤出新的数据，并返回一个Stream对象。
 *	2. 过滤器包含匹配的谓词。
 *		例如：判断p对象是否为男性的lambda表达式：
 *			Stream<Person> stream = people.stream();
 *			stream = stream.filter(p->p.getGender() == '男');
 */
public class Test03_collection_stream {
	
	/**
	 * 【案例】：创建一个元素为Person类的集合:people,使用Stream和forEach显示该集合所有元素。
	 * 
	 */
	public static void main(String[] args) {
		List<Person> people = createPerson();
		Stream<Person> stream = people.stream();
		stream.forEach(p -> {
			System.out.println(p);
		});
		
		
	}
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
