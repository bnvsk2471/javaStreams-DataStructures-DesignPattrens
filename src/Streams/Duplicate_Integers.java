package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate_Integers {
	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(10,20,30,30,20,10,60,80);
		Set<Integer> set=new HashSet<>();
		lst.stream().filter(x->!set.add(x))
			.forEach(x->System.out.println(x)); 
	}
}
