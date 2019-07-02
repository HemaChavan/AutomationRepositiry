package polymorphism;

public class Encap {

	public static void main(String[] args)
	{
		Encapsulation obj = new Encapsulation();
		obj.setEmpName("Erica");
		obj.setEmpAge(18);
		obj.setEmpSSN(112233);
		System.out.println("Employee name "+ obj.getEmpName());
		System.out.println("Employee SSN: "+ obj.getEmpSSN());
		System.out.println("Employee Age: "+ obj.getEmpAge());
	}
}
