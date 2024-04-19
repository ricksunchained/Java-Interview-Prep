package com.demo.java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MyClass {
	private int CONST = 5;

	int get() {
		return CONST;
	}

	int getMultiply() {
		return 3;
	}
}

public class MultipleOf5 {

	public static void main(String[] args) {

//		int CONST=5;
//		int multiply=3;

		MyClass ob = new MyClass();
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

//		listOfIntegers = listOfIntegers.stream().map(e -> e * multiply).filter(e -> e % CONST == 0)
//				.collect(Collectors.toList());

		listOfIntegers = listOfIntegers.stream().map(e -> e * ob.getMultiply()).filter(e -> e % ob.get() == 0)
				.collect(Collectors.toList());

		System.out.println(listOfIntegers);

	}

}