package polymorphism;

public class ThrownewException {
	static void checkEligibility(int age,int stuweight) {
		if(age<18 && stuweight<40 ) {
			System.out.println("Welcome to Registration");
		}
	
	else {
		throw new ArithmeticException("student not eligible for registration");
	}
	}
	public static void main(String args[]) {
		System.out.println("Welcoem to registration process");
		checkEligibility(10,30);
		System.out.println("Have a nice day");
	}

}
