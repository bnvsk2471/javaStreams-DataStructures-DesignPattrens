package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import StreamsEntity.StudentEntity;

public class StudentJava8 {

	public static void main(String[] args) {

		List<StudentEntity> list = Arrays.asList(new StudentEntity("Test1", 10), new StudentEntity("Test2", 11),
				new StudentEntity("Test3", 27), new StudentEntity("Test4", 24), new StudentEntity("Test5", 15),
				new StudentEntity("Test6", 16), new StudentEntity("Test7", 17), new StudentEntity("Test8", 20),
				new StudentEntity("Test9", 10), new StudentEntity("Test10", 9), new StudentEntity("Test11", 22),
				new StudentEntity("Test12", 23), new StudentEntity("Test13", 25), new StudentEntity("Test14", 30),
				new StudentEntity("Test15", 32), new StudentEntity("Test16", 36));

		List<StudentEntity> result = list.stream().filter(x -> x.getAge() > 15).collect(Collectors.toList());
		for (StudentEntity res : result) {
			System.out.println(res.getAge());
			
			
		}

		Map<Integer, String> map = list.stream().filter(x -> x.getAge() > 15)
				.collect(Collectors.toMap(StudentEntity::getAge, StudentEntity::getName));
		map.forEach((x, y) -> System.out.println(x + y));
	}

}
