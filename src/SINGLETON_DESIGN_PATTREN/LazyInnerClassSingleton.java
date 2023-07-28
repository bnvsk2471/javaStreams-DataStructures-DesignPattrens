package SINGLETON_DESIGN_PATTREN;

//Mostly used singleton pattren

public class LazyInnerClassSingleton {

	private LazyInnerClassSingleton() {

	}

	private static class Singletonhelper{
		private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
	}

	public static LazyInnerClassSingleton getInstance() {
		return Singletonhelper.instance;
	}

}


/*
 *Advantages of Lazy Inner Class Singleton:

1. Lazy Initialization: 
The Singleton instance is created only when getInstance() is called for the first time. 
This lazy initialization avoids unnecessary instance creation if the Singleton is not used 
during the program's execution.

2. ******Thread Safety: 
The Java language specification guarantees that the initialization of static fields within 
a class is thread-safe*****. Therefore, the Lazy Inner Class Singleton implementation is inherently 
thread-safe without requiring additional synchronization mechanisms.

3. Efficient: 
The use of inner static class ensures that the Singleton instance is created lazily and with 
minimal overhead, making it an efficient implementation.

4. No Synchronization Overhead: Unlike some other lazy initialization approaches 
(e.g., double-checked locking), the Lazy Inner Class Singleton doesn't need explicit 
synchronization, which can improve performance.

5. Overall, the Lazy Inner Class Singleton is a recommended approach for implementing 
Singleton in Java due to its simplicity, thread-safety, and efficient lazy initialization.

 */
