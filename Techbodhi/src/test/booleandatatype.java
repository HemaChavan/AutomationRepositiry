package test;
import java. util. Scanner;

public class booleandatatype {

	public static void main(String args[]) {
		
		//String b ;
		Scanner str = new Scanner(System. in);
		System.out.println("Input the String:");
		String b = str.nextLine(); 
		//boolean b = scan.nextLine();
		if(b.equals("true"))
		{
			System.out.println("true value");
			
		}
		else
		{
			System.out.println("false");
		}
	}


}
