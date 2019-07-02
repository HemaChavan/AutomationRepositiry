package keywords;

public class StaticMethodExample {
	
	static String Office = "Capgemini";
	int empid;
	String empname ;
	
	static void change()
	{
		Office = "Infosys";
	}
	StaticMethodExample(int id,String name)
	{
		empid = id;
		empname = name;
	}
	void display()
	{
		System.out.println(empid+" "+empname+" "+Office);
	}
	public static void main(String args[])
	{
		change();
		StaticMethodExample emp = new StaticMethodExample(121,"HC");
		emp.display();
	}
	

}
