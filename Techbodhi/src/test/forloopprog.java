package test;

public class forloopprog {

	public void for_test_prog()
	{
		int i ;
		for(i=10;i>=1;i--)
		{
			System.out.println("value of i is :" + i);
		}
	}
	public static void main(String args[])
	{
		
		forloopprog obj = new forloopprog();
		obj.for_test_prog();
		
	}
	
	
}