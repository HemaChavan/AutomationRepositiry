package test;

public class Interfaceimplementationclass implements interfaceclass {

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("This is child class");
	}
	public static void main(String args[])
	{
		interfaceclass obj = new Interfaceimplementationclass();
		//a=123; value of a cannot be changed
		System.out.println(a);
		obj.abc();
	}
}
