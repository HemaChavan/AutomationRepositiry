package polymorphism;

public class methodoverloading {

	int a=0;
	float b=0;
	public void add(int x,int y)
	{
		System.out.println("the value is :"+ (x+y));
		
	}
	public void add(float x,float y)
	{
		System.out.println("the value is :"+ (x+y));
		
	}
	public void add(int x,int y,int z)
	{
		System.out.println("the value is :"+ (x+y+z));
	}
	
	public static void main(String[] args)
	{
		methodoverloading obj =   new methodoverloading();
		obj.add(2, 3);
		obj.add(3.4f,6.7f);
		obj.add(2, 3,4);
		
		
	}
}
//Compile time polymorphisms
