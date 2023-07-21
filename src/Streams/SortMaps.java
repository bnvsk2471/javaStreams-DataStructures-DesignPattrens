package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

abstract class SortMaps {
	public static void main(String[] args) {
		
		Map<String, Integer> map= new HashMap<>();
		map.put("Eight",8);
		map.put("Nine", 9);
		map.put("Ten", 10);
		map.put("one", 1);
		
		List<Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());
		Collections.sort(entries,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
		
		System.out.println(entries);
		
	}


}
