package test;

public class interfaceimplementationclassjava8 implements interfacejava8,interface2java8 {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		interface2java8.super.method();
		//interfacejava8.super.method();
	}

	public static void main(String args[])
	{
		interfacejava8 obj = new interfaceimplementationclassjava8();
		interface2java8 obj1 = new interfaceimplementationclassjava8();
		interfaceimplementationclassjava8 obj2 = new interfaceimplementationclassjava8();
		obj2.method();
		obj1.method();
		obj.method();
		interfacejava8.method2();
		interface2java8.method2();
		
	}
}
