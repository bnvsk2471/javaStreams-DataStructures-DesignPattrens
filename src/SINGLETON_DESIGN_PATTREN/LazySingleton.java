package SINGLETON_DESIGN_PATTREN;

public class LazySingleton {
	
	// Lazy singleton is came to existence to avoid drawbacks of eager singleton
	// In this instance is created when first time is called
	
	//This is not thread safe because multiple methods can call this instance at a time. 
	
	private LazySingleton() {
		
	}
	private static LazySingleton instance;
	
	public static LazySingleton getInstance() {
		if (instance == null) {
			return instance=new LazySingleton();
		} else {
			return instance;
		}
	}
	
	/*Difference between Eager and Lazy
	 * 
	 * 
	 * Eager Singleton:

Eager Singleton pattern creates and initializes the Singleton instance at the time of class loading or during JVM startup.
The instance is created even before it is requested, meaning it is "eagerly" created.
The instance is stored in a static variable and is made accessible through a public static method.
Eager initialization ensures that the instance is available for use whenever needed, and it benefits from the JVM's built-in thread-safety mechanisms during class loading, making it thread-safe by default.
One potential drawback is that the instance is created even if it's not used during the program's execution, which could lead to unnecessary resource consumption.
Lazy Singleton:

Lazy Singleton pattern delays the creation and initialization of the Singleton instance until it is first requested.
The instance is created "lazily" when the getInstance() method is called for the first time.
The instance is usually stored in a private static variable, and the getInstance() method includes logic to check if the instance has already been created. If not, it creates a new instance and returns it.
Lazy initialization allows for on-demand instance creation, which can save resources if the Singleton instance is not always needed during the program's execution.
However, lazy initialization requires additional synchronization mechanisms (e.g., double-checked locking, synchronized blocks) to ensure thread safety, as multiple threads could potentially attempt to create the instance simultaneously.
In summary, the choice between eager and lazy Singleton depends on the specific requirements of your application:

Use eager Singleton when you want the instance to be created and available from the beginning of the program, ensuring simple and thread-safe access.

Use lazy Singleton when you want to delay the instance creation until it is needed, potentially saving resources if the instance is not always required. However, you need to be careful with thread safety and ensure proper synchronization mechanisms are in place to handle concurrent access to the instance.
	 * 
	 * 
	 * */
}
