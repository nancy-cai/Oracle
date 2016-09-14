
public class StaticVariable {
	
	/*Static keyword make it a ¡°class variable¡±., x1.i and x2.i, all instances of the same class share a single copy of static variables, 
	so x2.i will override the value of x1.i.
	A static method cannot refer to ¡°this¡± or ¡°super¡± keywords in anyway*/
	static int i;
	
	//No ¡°static¡± Keyword = Instance Variables.Each instance of the class has its own copy of the variable.
    int j;
 
    public static void main(String[] args) {
    	StaticVariable x1 = new StaticVariable();
    	StaticVariable x2 = new StaticVariable();
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;
        System.out.println(
                x1.i + " "
                + x1.j + " "
                + x2.i + " "
                + x2.j);
    }

}
