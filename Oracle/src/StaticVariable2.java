class Alpha {
 
    int ns;
    static int s;
 
    Alpha(int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }
 
    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);
    }
}

public class StaticVariable2 {

	public static void main(String[] args) {
		
	/*	all instances of the same class share a single copy of static variables, so s will have the same value since the method called after
	 * the initialization of all three instances. 
	 * But if 
	 *  Alpha ref1 = new Alpha(50);
	 *  ref1.doPrint();
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);
        ref2.doPrint();
        ref3.doPrint();
        Then the first s will be 50.*/
        Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}
