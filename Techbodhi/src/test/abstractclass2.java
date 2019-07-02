package test;

public abstract class abstractclass2 {
	
	String color;
	
	//abstract methods
	abstract double area();
	public abstract String tostring();
	
	//abstract class can have constructor
	public abstractclass2(String color)
	{
		System.out.println("Constructor of parent class is called");
		this.color = color;//this is used to refer the current class variables
	}
	
	//non abstract method
	public String getcolor() {
		return color;
	}
	

}
