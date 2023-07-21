package Streams;

import java.util.Arrays;
import java.util.List;

/*	
 	Map		-> 	Transforming Data
	Reduce	-> 	Aggregating Data
*/

public class MapAndReduce {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,21,23,25,26,10,15,16,20,10);
		
		System.out.println(numbers.stream().mapToInt(x->x).sum());
		
		System.out.println(numbers.stream().reduce(0, (a,b)->a+b));
		
		System.out.println(numbers.stream().reduce(Integer::sum));
		
		System.out.println(numbers.stream().reduce(1 , (a,b)->a*b));
	}
	
	

}
