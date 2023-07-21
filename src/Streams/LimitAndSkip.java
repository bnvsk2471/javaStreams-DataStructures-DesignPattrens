package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
// Limit : It is an intermediate operation that returns a stream not longer than the requested size.
//			As before the n parameter can't be negative. 

// Skip	 : The skip(n) method is another intermediate operation that discards the first n elements of a stream.
// 			The n parameter can't be negative, and if higher than the size of the stream, skip() return an empty Stream
*/
public class LimitAndSkip {
	
	public static void main(String[] args) {
		
		List<Integer> lst=Arrays.asList(10,20,30,30,20,10,60,80);
		
		List<Integer> limit= lst.stream().limit(3).collect(Collectors.toList());
		System.out.println(limit);
		System.out.println("--------------------");
		List<Integer> skip=lst.stream().skip(3).collect(Collectors.toList());
		System.out.println(skip);
		
	}

}
