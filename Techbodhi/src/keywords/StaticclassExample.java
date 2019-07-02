package keywords;

public class StaticclassExample {
	
	int x= 12;
	static String str = "Hello";
	static class nestedclass
	{
		public void disp() 
		{
			System.out.println("am in nested static class");
			System.out.println("value of str is: "+str);
			
		}
	}
	
	public static void main(String args[]) {
	StaticclassExample.nestedclass obj = new StaticclassExample.nestedclass() ;
	obj.disp();
		
	}

}










//Top level class cannot be static