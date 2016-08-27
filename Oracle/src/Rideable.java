
interface Rideable {
	
	String getGait();
	/*The interface body can contain abstract methods, default methods, and static methods. 
	 * An abstract method within an interface is followed by a semicolon, but no braces 
	 * (an abstract method does not contain an implementation).
	 * Default metho
	 * ds are defined with the default modifier, and static methods with the static keyword.*/
	
	int e=7;
	

}
/*With interfaces, all fields are automatically public, static, and final, 
 * and all methods that you declare or define (as default methods) are public.
 * A class that implements the interface must use all the methods and variables in that interface.
 * 
 * 
 * a class can implement multiple interfaces but inherit no more than one class.
 * An abstract class can have non-static members and methods to access those members,
 * but an interface is a mere composition of method declarations.
 */