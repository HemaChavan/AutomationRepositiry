package keywords;

public class thisexample {

	int rno;
	String name;
	float fees;
	thisexample(int rno,String name,float fees){
		this.rno = rno;
		this.name = name;
		this.fees = fees;
	}
	void display() {
		System.out.println(rno+" "+name+" "+fees+" ");
		
	}
	public static void main(String[] args) {
		thisexample obj1 = new thisexample(121,"abc",200f);
		thisexample obj2 = new thisexample(201,"xyz",120f);
		obj1.display();
		obj2.display();
		
	}
}
//this keyword differentiates the instance variables and local variables


