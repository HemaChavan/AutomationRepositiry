package practice_session;

interface interface_test {
	void disp();
	static int cube(int x ) {
		System.out.println(x*x*x);
		return x;
	}
	default void display() {
		System.out.println("displaying in interface");
	}
	

}
