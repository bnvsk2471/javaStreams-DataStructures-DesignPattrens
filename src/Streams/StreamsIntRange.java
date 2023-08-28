package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamsIntRange {
	
	List<Integer> list=Arrays.asList(3,5,6,7,8,10,20,30,25);
	
	public static void main(String[] args) {
		IntStream.range(2, 1000).filter(StreamsIntRange::filter) .forEach(x->System.out.print(x));
	}
	public static boolean filter(int x) {
		if(x%2==0) {
			return true;
		}else {
			return false;
		}
	}
	

}
