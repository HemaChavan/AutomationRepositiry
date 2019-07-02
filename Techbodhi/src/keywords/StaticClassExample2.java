package keywords;

public class StaticClassExample2 {
	
	static int data = 20;
	
	static class Nested{
		
		static void disp() {
			System.out.println("am inside static class and static method");
		}
		
	}
	class Nonstatic{
		
		void disp() {
			System.out.println("am inside nonstatic class and non static method");
		}
	}

	public static void main(String[] args) {
	StaticClassExample2.Nested.disp();
	StaticClassExample2 outer = new StaticClassExample2();
	StaticClassExample2.Nonstatic inner = outer.new Nonstatic();
	inner.disp();
		
	}
}
