package Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords_InGivenSentence {
	public static void main(String[] args) {
		
		String s="count the number of occurrence of words using java eight stream api api";
		
		Map<String, Long> result= Arrays.stream(s.split(" "))
							.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(result.toString());
		
	}

}
