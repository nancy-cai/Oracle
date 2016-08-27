
public class DoubleForLoop {

	public static void main(String[] args) {
	
		String[] oh = {"nancy","michael"};
		
		for(int i=1;i<3;i++){
			for(String a: oh){
				System.out.println(i+a);
				if(i==1) break;
			}
		}

	}

}
