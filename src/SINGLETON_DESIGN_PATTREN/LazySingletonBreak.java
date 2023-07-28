package SINGLETON_DESIGN_PATTREN;

public class LazySingletonBreak  extends MyClone{
	
	private LazySingletonBreak(){
		
	}
	private static LazySingletonBreak instance;
	
	public static LazySingletonBreak getInstance() {
		if (instance == null) {
			return instance=new LazySingletonBreak();
		} else {
			return instance;
		}
	}
}