package LogicalPrograms;

import java.util.HashMap;

public class LongestConsecutiveElements {
	
	public static void main(String[] args) {
		
		int[] arr= {11,7,25,6,3,5,9,8,4,6,5,0,12,13,14,16,20,21,22,23};
		HashMap<Integer, Boolean> map=new HashMap<>();
		for(int i=0;i<=arr.length-1;i++) {
			map.put(arr[i], true);
		}
		System.out.println(map);
		for(int i=0;i<=arr.length-1;i++) {
			if(map.containsKey(arr[i]-1)) {
				map.put(arr[i], false);
			}
		}
		System.out.println(map);
		
		int maxlength=1;
		for(int i=0;i<=arr.length-1;i++) {
			if(map.get(arr[i])==true) {
				int currlen=1;
				int val=arr[i];
				while(map.containsKey(val+1)==true) {
					currlen++;
					val++;
				}
				maxlength=Math.max(maxlength, currlen);
			}
		}
		System.out.println(maxlength);
		
	}
	
}
