package test;

public class instancevariable2 {
	
	public String name;
	private double salary;
	
	
	/*public void getname(String empname) {
		name= empname;
	}*/
	public instancevariable2(String empname) {
		name= empname;
	}
	public void getsalary(double empsalary) {
		salary= empsalary;
	}
	
	public void printEmp() {
		System.out.println("name: " +name);
		System.out.println("salary: " +salary);
	}
	
	public static void main(String args[]) {
		
		instancevariable2 emp = new instancevariable2("Hema");
		//emp.getname("Hema");
		emp.getsalary(200000);
		emp.printEmp();
		instancevariable2 emp1 = new instancevariable2("Latha");
		//emp.getname("Hema");
		emp1.getsalary(500000);
		emp1.printEmp();
					
	}

}
//using constructors 