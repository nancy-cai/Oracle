
public class DoubleForLoop {

	public static void main(String[] args) {
	
		String[] oh = {"nancy","michael"};
		
		for(int i=1;i<3;i++){
			for(String a: oh){
				System.out.println(i+a);
				if(i==1) break;
			}
		}
		
		int a[]={1,2,3};
		for(int var:a){
			int i=1;
			
			while(i<=var){
				System.out.println(++i);
			}
		}
		/*var=1,i=1: 2
		 *      i=2: 2>1,out inner loop
		 *var=2,i=1: 2
		 *      i=2: 3
		 *      i=3: 3>2,out
		 *var=3,i=1: 2
		 *      i=2: 3
		 *      i=3: 4
		 *      i=4: 4>3,out     
		 */

	}

}
