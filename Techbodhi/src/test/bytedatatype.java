package test;

import java.util.Scanner;

public class bytedatatype {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a no");
		int abc = sc.nextInt();
		System.out.println(abc+12);
		char a = 'G';
		int i = 89;
		byte b = 4;
		short s = 56;
		double d = 4.3555784778;
		float f = 4.73333434f;
		System.out.println("char: " +a);
		System.out.println("integer: " +i);
		System.out.println("byte: " +b);
		System.out.println("short: " +s);
		System.out.println("float: " +f);
		System.out.println("double: " +d);
	}

}
