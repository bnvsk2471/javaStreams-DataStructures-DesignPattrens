package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import StreamsEntity.StudentEntity;

public class MinMaxCountAverage {
	
	public static void main(String[] args) {
		
		
		List<StudentEntity> liststd=Arrays.asList(new StudentEntity("Santhosh", 30),
												new StudentEntity("Raghu", 28),
												new StudentEntity("Suresh", 27),
												new StudentEntity("Varun", 29));
		OptionalInt maxage = liststd.stream().mapToInt(age->age.getAge()).max();
		System.out.println("maxage = "+maxage);
		
		OptionalDouble avgage = liststd.stream().mapToInt(age->age.getAge()).average();
		System.out.println("avgage = "+avgage);
		
		OptionalInt minage = liststd.stream().mapToInt(age->age.getAge()).min();
		System.out.println("minage "+minage);
		
		int SumAge = liststd.stream().mapToInt(age->age.getAge()).sum();
		System.out.println("SumAge = "+SumAge);
		
	}

}
