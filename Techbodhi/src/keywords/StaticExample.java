package keywords;

public class StaticExample {
	
	static int x = 0;
	int y = 0;
	static String z ="HEllo";
	
	StaticExample()
	{
		x++;
		System.out.println("value of x is "+x); //Static variable
		
		y++;
		System.out.println("value of y is "+y); //Instance variable
		
		
	}
	
	public static void main(String args[]) {
		
		StaticExample c1 = new StaticExample();
		StaticExample c2 = new StaticExample();
		StaticExample c3 = new StaticExample();
		System.out.println("static string is "+z);
		
		
	}
	

}


//Static variable retains the value as memory is allocated only once -used for common properties 

//Local instance variable does not retain the value as memory gets allocated everytime -
