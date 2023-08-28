package DataStructuresLogical;

import java.util.Arrays;
import java.util.List;

public class GoodAndBadNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(2, 3, 5);
		Integer number = 20;
		int count = 0;
		Boolean temp = false;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0 && list.contains(i)) {
				temp = true;
			} else if (number % i == 0) {
				count++;
			}
		}
		if (count > 0) {
			temp = false;
		}

		System.out.println(temp);

	}

}
