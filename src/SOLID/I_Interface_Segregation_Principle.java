package SOLID;

/*
 * methods should not be forced to depend upon interface that they do not use
 * 
 * INTERFACE POLLUTION(larger interfaces using unrelated methods) :  means if we write lot of 
 * 	methods in interfaces then when a class implements these interfaces we need to override all these 
 * methods, in this situation some methods might not be used in this class which creates empty methods. 
 * 
 * TO AVOID	THIS WE NEED TO BREAK DOWN THE INTERFACES SUCH THAT NO EMPTY METHODS PRESENT IN THE CLASS
 * WHEN EXTEND THESE INTERFACE (WRITE HIGHLY COHESIVE INTRFACES)
 * 
 * SIGNS OF INTERFACE POLLUTION: 
 * 			1. Classes have empty method implementations
 * 			2. Methods implementation returns null or default/dummy values
 * this violates ISP 
*/


public class I_Interface_Segregation_Principle {

}
