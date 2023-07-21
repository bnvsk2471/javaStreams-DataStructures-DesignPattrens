package HashMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

public class example1 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> testmap=new HashMap<>();
		testmap.put("apple", 20);
		testmap.put("banana", 15);
		testmap.put("pineapple", 10);
		
		int sum=testmap.values().stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		//--------------------------------------------------------------------------\
		
		List<String> list=Arrays.asList("java","spring","boot","aws","devops");
		//Store the above data using Hash maps
		Map<Integer, String> maplist=list.stream()
							.collect(Collectors.toMap(i->list.indexOf(i), i->i));
		System.out.println(maplist);
		
		//--------------------------------------------------------------------------
		
		String s="Stream APIs are very easy to write";
		Map<String, Long> StrToMap=Arrays.stream(s.split("")).filter(ch->!ch.trim().isEmpty())
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(StrToMap);
		
		//-------------------------------------------------------------------------
		
		Integer countUnique=(int) Arrays.stream(s.split("")).distinct().filter(ch->!ch.trim().isEmpty()).count();
		System.out.println(countUnique);
		
		//----------------------------------------------------------------------------
		//Find the maximum number in a given list
		List<Integer> maxnum=Arrays.asList(10,9,2,5,21,2,3,25,20,25,58,102,25,236,21,452,21,585,25);
		Optional<Integer> max=maxnum.stream().sorted((a,b)->b.compareTo(a)).findFirst();
		System.out.println(max);
		
		//-------------------------------------------------------------------------------
		//Given a list of strings, concatenate them into a single comma-separated string.
		List<String> words = Arrays.asList("apple", "banana", "orange", "grape");
		String result = words.stream()
		        .collect(Collectors.joining(""));
		System.out.println(result);
		//-------------------------------------------------------------------------------
		
		//Find the average of a list of integers using the Stream API.
		List<Integer> avg=Arrays.asList(10,9,2,5,21,2,3,25,20,25,58,102,25,236,21,452,21,585,25);
		OptionalDouble avgs=avg.stream().mapToInt(i->i).average();
		//here when we convert avg to stream() then it will convert  
		System.out.println(avgs);
		//------------------------------------------------------------------------------
		
		
	}
	
	
}
