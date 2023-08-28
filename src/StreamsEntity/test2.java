package StreamsEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

import Streams.StudentObj;

public class test2 {
	public static void main(String[] args) {

		List<StudentObj> list2=Arrays.asList(
				new StudentObj(1, "santhosh", "kumar", "male", 30),
				new StudentObj(2, "ramya", "lakshmi", "female", 33),
				new StudentObj(3, "sai", "kiran", "male", 26),
				new StudentObj(4, "srinivas", "naga", "male", 35),
				new StudentObj(5, "bharathi", "devi", "female", 50),
				new StudentObj(6, "sriya", "anjana", "female", 8),
				new StudentObj(7, "likhitha", "lakshmi", "female", 2),
				new StudentObj(8, "Subrahmanyam", "venkata", "male", 62));
		
		String S="I am santhosh working eidiko and I have four years of experience and also I am good at java eight features";
		
		Map<String, Long> collect= Arrays.stream(S.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		List<String> names=new ArrayList();
		for(StudentObj stu:list2) {
			if(stu.getage()>26) {
				names.add(stu.getfirstName());
			}
		}
		System.out.println(names);
		
		List<String> names8= list2.stream().filter(x->x.getage()>26)
				.map(x->x.getfirstName())
				.collect(Collectors.toList());
		System.out.println(names8);
		
		System.out.println("---------------------------------------");
		
		
		
		//Grouping males and females. 
		Map<String, List<StudentObj>> group=list2.stream().collect(Collectors.groupingBy(StudentObj::getGender));
		List<StudentObj> femaleStudents =group.get("female");
		System.out.println(femaleStudents);
		
		//How would you find the average age of male students
		OptionalDouble averageage = list2.stream().filter(x->x.getGender().equals("male")).mapToInt(StudentObj::getage).average();
		System.out.println(averageage);
		
		//Can you find the names of female students whose age is less than 18
		List<String> list=list2.stream().filter(x->x.getGender().equals("female")&& x.getage()>18).map(x->x.getfirstName())
		.collect(Collectors.toList());
		System.out.println(list);
		
		
		//How many male and female students are there
		Map<String, Long> map=list2.stream()
				.collect(Collectors.groupingBy(StudentObj::getGender,Collectors.counting()));
		System.out.println(map);
		
		 //Can you find the oldest student in the list
		Optional<StudentObj> oldestStudent = list2.stream().max(Comparator.comparing(StudentObj::getage));
		System.out.println(oldestStudent);
		
		//How would you create a new list of students sorted by age in ascending order
		List<StudentObj> listsort=list2.stream().sorted(Comparator.comparingInt(StudentObj::getage)).collect(Collectors.toList());
		System.out.println(listsort);
		
		 //Can you find the names of female students with ages between 20 and 30?
		List<String> age=list2.stream().filter(x->x.getage()>20 && x.getage()<30).map(x->x.getfirstName()).collect(Collectors.toList());
		System.out.println(age);
		
		//Can you find the names of students whose first name starts with the letter "s"
		list2.stream().filter(x->x.getfirstName().startsWith("s")).forEach(x->System.out.println(x.getfirstName()));
		
		 // Can you create a map where the key is the student's first name and the value is the student's age
		Map<String, String> maplist=list2.stream().collect(Collectors.toMap(StudentObj::getfirstName,StudentObj::getlastName));
		System.out.println(maplist);
		
		  //Find the sum of ages of all female students
		Integer femalesum=list2.stream().filter(x->x.getGender().equals("female")).mapToInt(StudentObj::getage).sum();
		System.out.println(femalesum);
		
		//Find the top 3 male students with the highest ages
		list2.stream().filter(x->x.getGender().equals("male")).
		sorted(Comparator.comparingInt(StudentObj::getage).reversed()).limit(3)
		.forEach(x->System.out.println(x.getfirstName()));
	
		 //Create a comma-separated string of the first names of female students sorted alphabetically.
		String joining= list2.stream().filter(x->x.getGender().equals("female")).map(StudentObj::getfirstName).sorted().collect(Collectors.joining(", "));
		System.out.println(joining);
	}

}
