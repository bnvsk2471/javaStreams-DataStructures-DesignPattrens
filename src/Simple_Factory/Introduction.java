package Simple_Factory;

public class Introduction {
	
	//Multiple Types can be instantiated and the choice is based on some simple criteria. 
	
	//In simple words for suppose we have Post class and this post class have some subclasses like 
	//productpost, newspost etc. In this case we need to create subclass based on client input so for 
	//that we create Postfactory and write some conditions like switch or ifelse to redirect it to 
	//subclass based on user input. (Refer example in this package)
	
	public static void main(String[] args) {
		String key="Pudding";
		
		if(key.equalsIgnoreCase("pudding")) {
			//some pudding logic
		}
		if(key.equalsIgnoreCase("Cake")) {
			//some cake logic
		}
	}

	/* 1.Here we simply move the instantiation logic to a seperate class and most commonly to a 
	 * 		Static method of this class
	 * 2.Some do not consider simple factory to be a "design patterns", as its simply a method that 
		encapsulates object installation. Nothing complex goes on in this mehod. 
			(simple factory is often confused with "factory design" pattern)
		3.Typically we want to do this if we have more than one option when instantiationg object and a 
		simple logic is used to choose correct class.
	 */
}

/* 			 
 * 									---->(provides a static method to get
 * 									|	   instance of product subclass)
 * 									|
 * 								(Static)	
 * 				Client ------> SimpleFactory----------->Product (Object of this class and Its
															|		subclasses are needed)
															|
													---------------------
													|					|
										ImplementationClass			ImplementationClass
  											ProductA					ProductB
*/
