package LogicalPrograms;

import java.util.Arrays;

public class longest_common_prefix_string_among_an_array_of_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"flower","flow","floght"};
		Integer minword=Arrays.stream(arr).map(x->x.length()).sorted().findFirst().orElse(0);
		System.out.println(minword);
		
		StringBuilder prefix = new StringBuilder();
		int i;
		for (i = 0; i < minword; i++) {
			final int index = i;
            char currentChar = arr[0].charAt(i);

            if (Arrays.stream(arr).allMatch(str -> str.charAt(index) == currentChar)) {
                prefix.append(currentChar);
            } else {
                break;
            }
        
    }
		System.out.println(prefix);
		
	}

}
