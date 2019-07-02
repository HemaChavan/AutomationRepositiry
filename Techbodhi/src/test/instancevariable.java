package test;

public class instancevariable {

int Instancevariable = 3; //instance variable
int Instancevariable1 =4;
	
	void StudentAge()
	{
		int age=0 ;//local variable
		age = age +5;
		System.out.println("Student age is :" +age );
	}


public static void main(String args[])
	{
			instancevariable obj1 = new instancevariable();
			instancevariable obj2 = new instancevariable();
			System.out.println(obj1.Instancevariable);
			System.out.println(obj2.Instancevariable);
			obj2.Instancevariable = 6;
			System.out.println(obj1.Instancevariable);
			System.out.println(obj2.Instancevariable);
		}

}


//public , protected and default instance variables are same with in the package 
//private cannot be used outside the class /interface
//default,public can be used with in the same package
//protected can be used outside the package using extend keyword
