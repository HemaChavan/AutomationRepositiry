package keywords;

public class superexampleimplementation extends superexample{
	String myname = "selenium";
	
	void disp() {
		
		System.out.println("print the string myname : "+myname);
		System.out.println("print the string myname : "+ super.myname);
	}
	 
	public static void main(String args[]) {
		
		superexampleimplementation obj = new superexampleimplementation();
		obj.disp();
	}
}
