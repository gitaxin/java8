package top.hao456.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test04_collection_filter {

	
	public static void main(String[] args) {
		
		List<Person> people = createPerson();//调用初始化集合的静态方法，初始化一个集合
		Stream<Person> stream = people.stream();
		stream.filter(p -> p.getName().indexOf("菲")>-1)//过滤器中传入lambda表达式，表达式代码块中书写判断条件，返回一个布尔值
		.forEach(p -> {
				  	System.out.println(p);
		});
	}
	
	//初始化集合的静态方法
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

