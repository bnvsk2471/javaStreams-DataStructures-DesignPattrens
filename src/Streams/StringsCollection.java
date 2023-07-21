package Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringsCollection {
	public static void main(String[] args) {
		
		String S="I am santhosh I am santhosh I am Test";
		
		Map<String, Long> sort= Arrays.stream(S.split(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(x->x.getValue()>1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(sort);
	}
}
