package DataStructuresLogical;

public class ArraysGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int A[]= {2,2,4,8,2,3,1,0,1};
		int currentIndex=0;
		boolean temp=true;
		try{
		while(temp==true && currentIndex<=A.length ) {
			if(currentIndex>=A.length) {
				System.out.println("True");
				temp=false;
			}
		if(A[currentIndex]==0 && currentIndex<=A.length ) {
			System.out.println("False");
			break;
		}else if(A[currentIndex]>0 && currentIndex<=A.length) {
			currentIndex=A[currentIndex]+currentIndex;
		}else {
			System.out.println("True");
			temp=false;
			break;
		}
		
		}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("");
		}
	}
}
