package test;
public class Localvariable 
{
		
	void StudentAge()
	{
		int age=0 ;
		age = age +5;
		System.out.println("Student age is :" +age );
	}


public static void main(String args[])
	{
			Localvariable obj = new Localvariable();
			obj.StudentAge();
			instancevariable obj2 = new instancevariable();
			System.out.println(obj2.Instancevariable1);
		}

}