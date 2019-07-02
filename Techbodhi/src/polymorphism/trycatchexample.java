package polymorphism;

public class trycatchexample {
	public static void main(String args[]) {
		try {
			int a[] = new int[5];
			a[4] = 30 /0;    //a[4] = 30/5 is correct ;a[8]
		}
		catch(ArithmeticException e) 
		{
			System.out.println("task1 is completed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("task2 is completed");
		}
		catch(Exception e)
		{
			System.out.println("Common task is completed");
	
		}
		finally
		{
			System.out.println("Final block is always executed");
		}
		
		System.out.println("rest of the code");
		
	
}
}
//last catch should be in lastly only cannot be mentioned at the beginning 
