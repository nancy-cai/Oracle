
//http://toolsqa.com/java/basic-java-programming/polymorphism/

public class Polymorphism extends Animals{
	
	/*extending an abstract class without implementing all of its ABSTRACT method results in a compile-time error,
	there will be no object of such class, so we can't create an object of this class i.e: */
	        String talk(){
	        return "meow";
	        } 
// when a normal class uses the parent abstract class's abstract methods, we must put body for them. Otherwise it became abstract methods and the child class must be defined as abstract class
	        
	        
	      public static void main(String[] args) {
	 
	        Animals[] pets = new Animals[2];
	        pets[0] = new Polymorphism();
	        
	     // Here the error msg says cannot instantiate the type Animals coz it's an abstract class
	        pets[1] = new Animals(); 
	                
	       for (int i = 0; i < pets.length; i++) {
	            System.out.println("Pet[" + i + "]: " + pets[i].talk());
	            
	            }   
	        }
	    }


