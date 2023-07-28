package SINGLETON_DESIGN_PATTREN;

public class TestEagerSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerSingleton obj1=EagerSingleton.getInstance();
		System.out.println(obj1.hashCode());
		
		EagerSingleton obj2 = EagerSingleton.getInstance();
		System.out.println(obj2.hashCode());

	}

}
