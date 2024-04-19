package com.demo.java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListManipulation {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

//		listOfStrings = listOfStrings.stream().map(s -> "[" + s + "], ").collect(Collectors.toList());
		String s = listOfStrings.stream().sorted().collect(Collectors.joining(", ", "[", "]"));

		System.out.println(s);

	}

}
