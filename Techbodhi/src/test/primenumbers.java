package test;

import java.util.Scanner;

public class primenumbers {
	//int num =17;
	public void prime_func() {
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a no");
		int abc = sc.nextInt();
		num =abc; 
		
		int i ,counter=0;
		for(i=1;i<=num;i++) {
			if(num%i == 0) {
			counter++;		
		
			}
		}
		if(counter ==2)
		{
			System.out.println("number entered is an prime number" +num);
		}
		else
		{
			System.out.println("number entered is not an prime number" +num);
		}
		
	}
	public static void main(String args[]) {
		primenumbers prime = new primenumbers();
		prime.prime_func();
		
	}
	
}
