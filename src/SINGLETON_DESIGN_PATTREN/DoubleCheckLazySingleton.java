package SINGLETON_DESIGN_PATTREN;

public class DoubleCheckLazySingleton {

	private DoubleCheckLazySingleton() {

	}

	private static DoubleCheckLazySingleton instance;

	public static DoubleCheckLazySingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckLazySingleton.class) {
				if (instance == null) {
					return instance = new DoubleCheckLazySingleton();
				}
			}
		}
		return instance;
	}

}

/*
 * Explanation:
 * 
 * The class DoubleCheckLazySingleton has a private static variable instance,
 * which holds the single instance of the class. It is declared as volatile to
 * ensure that changes made to it are visible to all threads. This is crucial
 * for the correctness of the Double-Checked Locking pattern.
 * 
 * The constructor of the class is private, preventing other classes from
 * directly instantiating DoubleCheckLazySingleton.
 * 
 * The public static method getInstance() provides access to the single
 * instance. It checks if the instance is null (first check). If it is null, it
 * enters a synchronized block using DoubleCheckLazySingleton.class as the lock.
 * 
 * Inside the synchronized block, the code performs another check to see if the
 * instance is still null (second check). This double-check is necessary to
 * avoid race conditions that might occur if multiple threads simultaneously
 * pass the first check and enter the synchronized block.
 * 
 * If the instance is still null inside the synchronized block, it creates a new
 * instance of DoubleCheckLazySingleton and assigns it to the instance variable.
 * 
 * Once the instance is created, the method exits the synchronized block and
 * returns the instance.
 * 
 * By using double-checked locking, this implementation achieves lazy
 * initialization of the Singleton instance while minimizing the synchronization
 * overhead. It ensures that only the first thread that calls getInstance()
 * creates the instance, and subsequent threads simply return the already
 * created instance, avoiding unnecessary locking for the latter calls. The
 * volatile keyword ensures that the changes to the instance variable are
 * immediately visible to all threads, which is essential for the correctness of
 * the pattern.
 * 
 * 
 */
