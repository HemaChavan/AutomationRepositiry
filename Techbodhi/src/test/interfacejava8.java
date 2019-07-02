package test;

public interface interfacejava8 {

	default void method()
	{
		System.out.println("This is default method class1");
		
	}
	static void method2()
	{
		System.out.println("static method 2 in class1");
	}
}
//no constructor used here 
