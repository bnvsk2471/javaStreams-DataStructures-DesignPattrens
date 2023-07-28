package SINGLETON_DESIGN_PATTREN;

public class TestLazySingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazySingletonBreak obj1=LazySingletonBreak.getInstance();
		System.out.println(obj1.hashCode());
		
		LazySingletonBreak obj2 = null;
		try {
			obj2 = (LazySingletonBreak) obj1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(obj2.hashCode());

	}

}
