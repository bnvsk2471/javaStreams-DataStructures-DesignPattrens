package Streams;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumbersStreams {
	public static void main(String[] args) {
		Random random=new Random();
		IntStream result=random.ints().limit(10);
		result.forEach(System.out::println);
		
	}
}
