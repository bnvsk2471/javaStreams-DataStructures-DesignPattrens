package StreamsEntity;

public class test {

	public static void main(String[] args) {
			String s1 = "santhosh";
	        String s2 = new String("santhosh");

	        int hash1 = System.identityHashCode(s1);
	        int hash2 = System.identityHashCode(s2);

	        System.out.println("s1 identity hash: " + hash1);
	        System.out.println("s2 identity hash: " + hash2);

	}

}
