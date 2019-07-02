package practice_session;

public class abstract_test_implementation extends abstract_test{ 

	void display() {
		 System.out.println("Child class inherited from abstratc class");
    }
	abstract_test_implementation(){
		System.out.println("constructor in child class");
	}
	
	public static void main(String[] args) {
		abstract_test obj = new abstract_test_implementation();
		obj.display();
		obj.display1();
	}
	
}
