package test;

public class staticvariable {
	
	int id;
	String name;
	static String company = "CapGemini";
	static int sal = 200000;
	
	public staticvariable(int x,String xyz) {
		id = x;
		name = xyz;
	//	System.out.println(id+" "+name+" "+company);
	}
	public void printemp()
	{
		System.out.println(id+" "+name+" "+company+" "+sal);
		
	}

	public static void main(String args[]) {
		staticvariable emp1 = new staticvariable(101,"Hema");
		staticvariable emp2 = new staticvariable(102,"Sri ");
		staticvariable emp3 = new staticvariable(103,"Isha");
		emp1.printemp();
		emp2.printemp();
		emp3.printemp();
	}
	
	

}
