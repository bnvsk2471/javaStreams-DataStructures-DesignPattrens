package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		
		List<StudentObj> list2=Arrays.asList(
				new StudentObj(1, "santhosh", "kumar", "male", 30),
				new StudentObj(1, "ramya", "lakshmi", "female", 33),
				new StudentObj(1, "sai", "kiran", "male", 26),
				new StudentObj(1, "srinivas", "naga", "male", 35),
				new StudentObj(1, "bharathi", "devi", "female", 50),
				new StudentObj(1, "sriya", "anjana", "female", 8),
				new StudentObj(1, "likhitha", "lakshmi", "female", 2),
				new StudentObj(1, "Subrahmanyam", "venkata", "male", 62)
				);
		//Grouping males and females. We can print any values using this data
		Map<String, List<StudentObj>> list3 = list2.stream().collect(Collectors.groupingBy(StudentObj::getGender));
		list3.entrySet().stream().forEach(x->System.out.println(x.getValue()));
		
		//How would you find the average age of male students
		   double average = list2.stream()
	                .filter(student -> student.getGender().equals("male"))
	                .mapToInt(StudentObj::getage)
	                .average().orElse(0.0);
		   System.out.println(average);
		   
		   
		   //Can you find the names of female students whose age is less than 18
		   List<String> names=list2.stream()
				   	.filter(x->x.getage()>18 && x.getGender().equals("female")).map(x->x.getfirstName()).collect(Collectors.toList());
		   System.out.println(names);
		   
		   
		   //How many male and female students are there
		   Map<String, Long> gendercount=list2.stream()
				   .collect(Collectors.groupingBy(StudentObj::getGender,Collectors.counting()));
		   System.out.println(gendercount);
		   
		   //Can you find the oldest student in the list
		   Optional<StudentObj> oldStudent=list2.stream().max(Comparator.comparing(StudentObj::getGender));
		   System.out.println(oldStudent);
		   
		   //How would you create a new list of students sorted by age in ascending order
	       List<StudentObj> sortedbyage=list2.stream().
	    		   sorted(Comparator.comparingInt(StudentObj::getage)).
	    		   collect(Collectors.toList());
	       System.out.println(sortedbyage);
	       
	       //Can you find the names of female students with ages between 20 and 30?
	       List<String> namesbw20and60= list2.stream().filter(x->x.getage()>20 && x.getage()<60)
	    		   .map(StudentObj::getfirstName).collect(Collectors.toList());
	       System.out.println("namesbw20and60  ::::"+namesbw20and60);
	       
	       //How would you create a new list of students sorted by age in ascending order
	       List<StudentObj> sortedbyagedec=list2.stream().
	    		   sorted(Comparator.comparingInt(StudentObj::getage).reversed()).
	    		   collect(Collectors.toList());
	       System.out.println(sortedbyagedec);
	       
	       //Can you find the names of students whose first name starts with the letter "s"
	       List<String> namesstartswiths= list2.stream().filter(x->x.getfirstName()
	    		   .startsWith("s")).map(x->x.getfirstName()).collect(Collectors.toList());
	       System.out.println(namesstartswiths);
	       
	       // Can you create a map where the key is the student's first name and the value is the student's age
	       Map<String, Integer> firstnameandage = list2.stream().collect(Collectors.toMap(StudentObj::getfirstName,StudentObj::getage));
	       System.out.println(firstnameandage);
	       
	       //Find the sum of ages of all female students
	       Integer sumage=list2.stream().filter(x->x.getGender().equals("female")).mapToInt(StudentObj::getage).sum();
	       System.out.println(sumage);
	       
	       
	       //Find the top 3 male students with the highest ages
	       List<String> top3male= list2.stream()
	    		   .filter(x->x.getGender().equals("male"))
	    		   .sorted(Comparator.comparing(StudentObj::getage).reversed())
	    		   .map(x->x.getfirstName()).limit(3).collect(Collectors.toList());
	       System.out.println(top3male);
	       
	       //Create a comma-separated string of the first names of female students sorted alphabetically.
	       String femaleFirstNameList = list2.stream()
	    	        .filter(student -> student.getGender().equals("female"))
	    	        .map(StudentObj::getfirstName)
	    	        .sorted()
	    	        .collect(Collectors.joining(", "));

	    	System.out.println("Comma-separated first names of female students: " + femaleFirstNameList);
	
	}

}
