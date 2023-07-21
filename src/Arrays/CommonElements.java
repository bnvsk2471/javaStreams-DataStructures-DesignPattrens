package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {
	public static void main(String[] args) {
		
		int[] array1= {9,8,5,6,1,2,3,4,5,6,24,36};
		int[] array2= {9,8,5,6,1,2,0,5,6,12,13,24};
		
		List<Integer> list=Arrays.stream(array1).filter(number->Arrays.stream(array2)
				.anyMatch(array2number->array2number==number)).boxed()
				.collect(Collectors.toList());
		System.out.println(list); 
	}

}
