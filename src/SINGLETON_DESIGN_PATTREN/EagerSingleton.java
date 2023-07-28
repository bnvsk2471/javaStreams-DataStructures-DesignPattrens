package SINGLETON_DESIGN_PATTREN;

public class EagerSingleton {
	
	// The below constructor is not mandatory because JVM will create one by default. 
	private EagerSingleton() {
		
	}
	
	
	//Create the instance of the class at the time of class loading
	
	/*What is class loading???
	 * When java program is executed, The JVM needs to load classes into the memory before they can be used.
	 * Class loading is process by which the JVM locates the bytecode (Complied java code) of a class and loads into memory. 
	 * 
	 * 
	 */	
	private static final EagerSingleton instance = new EagerSingleton();
	
	/*
	 * 1.Making the instance variable final ensures that once the instance is
	 * created and assigned, it cannot be re-assigned or modified later in the
	 * program's execution. This helps maintain the singleton behavior and prevents
	 * accidental changes to the instance
	 * 
	 * 2.Static Variable Initialization: As part of the class loading process, 
	 * static variables are initialized. In this case, the EagerSingleton class 
	 * has a static variable called instance, which is initialized on the same line 
	 * where it is declared:
	 * The right side of the assignment new EagerSingleton() calls the constructor 
	 * of the EagerSingleton class and creates an instance of the EagerSingleton object.
	 * 
	 * 3.Singleton Instance Creation: Since the static variable instance is being initialized 
	 * while the class is loading, the JVM will create a single instance of the EagerSingleton 
	 * object right away, and this instance will be stored in the instance variable.
	 * 
	 * 4.Access through Static Method: The class also provides a public static method called getInstance():
	 * 
	 * 5.This method allows other classes to get access to the single instance of the EagerSingleton class. 
	 * When getInstance() is called, it simply returns the instance that was created during class loading.
	 * 
	 * 
	 * 
	 */	
	public static EagerSingleton getInstance() {
		return instance;
	}
	
	/* 
	 * Note: The eager initialization approach ensures that the singleton instance is created 
	 * when the class is loaded, even before any other code tries to access it. It guarantees 
	 * that there is only one instance throughout the program's execution, and it benefits from 
	 * JVM's built-in thread-safety mechanisms during class loading to ensure safe and proper initialization. 
	 * 
	 * DRAWBACKS : 
	 * However, one potential drawback of this approach is that the instance is created 
	 * regardless of whether it's actually needed in the program. This may lead to unnecessary resource 
	 * consumption if the instance is never used. In scenarios where memory usage is a concern, 
	 * lazy initialization techniques might be preferred.
	 * 
	 * 
	 * 
	 * */

}
