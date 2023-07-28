package SINGLETON_DESIGN_PATTREN;

public class TestLazySingletonBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazySingleton obj1=LazySingleton.getInstance();
		System.out.println(obj1.hashCode());
		
		LazySingleton obj2 = LazySingleton.getInstance();
		System.out.println(obj2.hashCode());

	}

}
