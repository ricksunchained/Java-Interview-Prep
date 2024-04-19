package com.demo.java8streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByPersonAgeAndName {
	public static void main(String[] args) {
		// Create a list of Person objects
		List<Person> people = new ArrayList<>();
		people.add(new Person("John", 30));
		people.add(new Person("Alice", 25));
		people.add(new Person("Bob", 30));

		// Sort the list first by age and then by name
//		people.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));

//		people = people.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed())
//				.collect(Collectors.toList());

//		people = people.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed())
//				.collect(Collectors.toList());
		
//		people = people.stream().sorted(Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getName))
//				.collect(Collectors.toList());
		

		// Print the sorted list
		for (Person person : people) {
			System.out.println(person);
		}
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}