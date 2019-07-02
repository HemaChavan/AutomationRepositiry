package practice_session;

class interface_test_implementation implements interface_test {
	
	public void disp() {
		System.out.println("implementing interface in child interface");
	}

	public static void main(String[] args) {
		interface_test obj = new interface_test_implementation();
		obj.disp();
		interface_test.cube(3);
		obj.display();

	}

}
