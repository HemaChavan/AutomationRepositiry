package polymorphism;

public class singleinheritanceimplementation extends singleinhertitance {
	
	int studentno =125;
	public void studentmethod()
	{
		System.out.println("Student is in parent class");
		System.out.println("Student rollno is:"+studentno);
	}
	public static void main(String[] args)
	{
		singleinheritanceimplementation obj = new singleinheritanceimplementation();
		obj.studentmethod();
		System.out.println("Parent class student "+obj.studentno);
		System.out.println("child class student "+obj.studentrno);
	}

}
