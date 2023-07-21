package Arrays;

import java.util.Arrays;
import java.util.Optional;

public class SecondSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] secondsmall= {1,1,3,5,6,2,9};
		Optional<Integer> secondsmallest=Arrays.stream(secondsmall).distinct().sorted().skip(1).findFirst();
		System.out.println(secondsmallest);
		
		Integer[] secondlarge= {1,3,5,6,2,9};
		Optional<Integer> secondlargest=Arrays.stream(secondlarge).distinct().sorted((a,b)->b.compareTo(a)).skip(1).findFirst();
		System.out.println(secondlargest);
		
		

	}

}
