package keywords;

public class thisconstructor {

	thisconstructor(){
		this(2);
		System.out.println("am in default constructor");
	}
	thisconstructor(int x){
		//this();
		System.out.println("am in parameterised constructor");
		
	}
	public static void main(String args[]) {
		thisconstructor obj = new thisconstructor();
		
	}
	
	
	
}
