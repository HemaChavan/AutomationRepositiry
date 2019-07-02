package test;

public class abstractclassimplementation2 extends abstractclass2 {

	double radius;
	public abstractclassimplementation2(String color,double radius) {
		super(color);
		System.out.println("Constructor of child class is called");
		this.radius = radius;
		
	}

	@Override
	double area() {
		return 2*2;
	}

	@Override
	public String tostring() {
		return "Circle color is "+super.color +" and area is "+area();
	}
	
	public static void main (String[] args) {
		abstractclass2 obj = new abstractclassimplementation2("orange",2); //upcasting
		System.out.println(obj.tostring());
	}
}
