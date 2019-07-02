package test;

import java.util.Scanner;

public class ifelse {
	
	int num1;
	int check=0;
	
	public void takeinputfunc() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a no");
		int abc = sc.nextInt();
		num1 =abc; 
	}
	public void checkfunc() {
		
		if((num1%2) == 0)
		{
			check=1;
			
		}
		else
		{
			check=0;
			
		}
		
	}
	
	public void displfunc() {
		if(check == 1) {
			System.out.println("Number entered is an Even"+ num1);
		}
		else
		{
			System.out.println("Number entered is an Odd"+ num1);
		}
			
		
	}
		public static void main(String args[])
		{
			
			ifelse obj = new ifelse();
			obj.takeinputfunc();
			obj.checkfunc();
			obj.displfunc();
		}
	

}
