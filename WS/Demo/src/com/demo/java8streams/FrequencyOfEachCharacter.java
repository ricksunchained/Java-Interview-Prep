package com.demo.java8streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfEachCharacter {

	void mapper(Map<String, Integer> map, String e) {
		if (map.containsKey(e)) {
			int x = map.get(e);
			map.put(e, ++x);
		} else {
			map.put(e, 1);
		}
//
	}

	static void problem(String s) {

		final Map<String, Integer> map = new HashMap<>();
		List<String> s1 = Arrays.asList(s.toLowerCase().split(""));
		s1.stream().map(e -> );

		System.out.println(map);
	}

	public static void main(String[] args) {

		String inputString = "ava Concept Of The Day";

		Map<Character, Long> map = inputString.toLowerCase().chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);

		Map<Character, Long> map2 = inputString.toLowerCase().chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map2 = map2.entrySet().stream().filter(m -> m.getValue().equals(1l))
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		System.out.println(map2);
		System.out.println("--------------------------");
		problem(inputString);
//		System.out.println(Arrays.toString(inputString.chars().mapToObj(c-> (char)c).distinct().limit(1).toArray()));
	}

}
