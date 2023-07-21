package StreamsDurga;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * COLLECTION : If we want to represent a group of objects as a single entity then we should go for collection. 
 * STREAM:		If we want to process objects from the collection then we should go for streams. 
 * 
 * Java.util.stream package
 */

public class CollectionsAndStreams {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(10,20,12,13,15,16,20,21,22,23,25,26,2,8);
		//Filters are are used to filter by applying some operations.
		List<Integer> evens=list.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(evens);
		
		//add +2 for all the numbers
		//Maps are used to apply some operations
		List<Integer> addtolist=list.stream().map(x->x+2).collect(Collectors.toList());
		System.out.println(addtolist);
		
		List<Integer> sort=list.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(sort);
		
		
	}
}

/*
 * Some methods
 * count()
 * sorted()
 * 
*/
