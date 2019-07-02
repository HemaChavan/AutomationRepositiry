package polymorphism;

public class Encapsulation {
	private int ssn;
	private String empname;
	private int empage;
	
	public int getEmpSSN() {
		return ssn;
	}
	
	public String getEmpName() {
		return empname;
	}
	
	public int getEmpAge() {
		return empage;
	}
	
	public void setEmpAge(int newvalue) {
		if(newvalue <18 || newvalue > 75) {
			throw new IllegalArgumentException();
		}
		empage = newvalue;
	}
	public void setEmpName(String newvalue) {
		empname = newvalue;
	}
	public void setEmpSSN(int newvalue) {
		ssn = newvalue;
	}
	
}

