package test;

public class Constructor {

	int sum ;
	String name; 
	public Constructor() {
		
			System.out.println("hello");
			System.out.println("sum value is :" + sum);
		
		}
	public Constructor(int a ,int b ) {
		
		sum = a+b;
		
	}
	public void disp()
	{
		System.out.println("sum value is " +sum);
	}
	
	public static void main(String args[])
	{
		Constructor constructor = new Constructor();
		Constructor constructor1 = new Constructor(3,9);
		//System.out.println("sum value is " +constructor1.sum);
		constructor1.disp();
		
	}
	
}

//Constructor is only used to initialise the Objects only
//Using "instance variable" we can indirectly return the values and display them using the objects or in another function directly
//Local variables are local to the function only 
//Instance variables can be called from anywhere with in the class