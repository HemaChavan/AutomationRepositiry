package test;

import java.util.Scanner;

public class ifelseprg2 {
	
	int num1;
	int check=0;
	
	public void takeinputfunc() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a no");
		int abc = sc.nextInt();
		num1 =abc; 
	}
	public void checkfunc() {
		
		if(num1 == 1)
		{
			System.out.println("User has entered the input as :1 ");
			
		}
		else if(num1 == 2)
		{
			System.out.println("User has entered the input as :2 ");
			
		}
		else if(num1 == 3)
		{
			System.out.println("User has entered the input as :3 ");
			
		}
		else
		{
			System.out.println("User has entered someother input : " + num1);
				
		}
			
		}
		
		public static void main(String args[])
		{
			
			ifelseprg2 obj = new ifelseprg2();
			obj.takeinputfunc();
			obj.checkfunc();
			
		}
	

}
