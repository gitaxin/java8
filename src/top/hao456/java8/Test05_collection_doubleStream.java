package top.hao456.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test05_collection_doubleStream {

	public static void main(String[] args) {
		
		List<Person> people = createPerson();
		Stream<Person> stream = people.stream();
		double asDouble = stream.filter(p -> p.getName().indexOf("菲")>-1)
			   .mapToDouble(p -> p.getHeight())
			   .average()
			   .getAsDouble();
		System.out.println(asDouble);
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
