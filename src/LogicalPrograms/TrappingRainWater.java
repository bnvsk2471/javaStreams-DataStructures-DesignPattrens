package LogicalPrograms;

public class TrappingRainWater {
	public static void main(String[] args) {
		
		int height[] = {6,2,3,5,1};
		
		int count=0;
		int k;
		for(int i=0;i<=height.length-2;i++) {
			for(int j=height[i];j>=0;j--) {
				int temp=0;
				for(k=i+1;k<=height.length-1;k++) {
					if(j>height[k]) {
						temp++;
					}else {
						break;
					}
				}
				if(k==height.length) {
					temp=0;
				}
				count=count+temp;
			}
		}
		System.out.println(count);
	}

}
