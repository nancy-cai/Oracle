
public class IncrementalOperator {
	

	public static void oh(){
		int as=9;
		
	// if it's a++, then 10>a++, 10>9 first, then +1, so the result would be "hello world"	
		if(++as<10){
			System.out.println("hello world");
		}else{
			System.out.println("hello universe");
		}
	}

	public static void main(String[] args) {
		
		
		oh();
	}

}
