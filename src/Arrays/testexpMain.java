package Arrays;

public class testexpMain {

	public static void main(String[] args) throws testException {
		
		int a=10;

		try{
		if(a==11) {
			System.out.println("ok");
		}
		else {
			throw new testException("number should be 11");
		}
		}catch(testException e) {
			System.out.println(e.getMessage());
		}
		
	
	}

}
