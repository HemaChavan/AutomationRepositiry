package keywords;

public class thismethodexample {

	void m() {
		System.out.println("am in M method");
	}
	void n() {
		System.out.println("am in N method");
		this.m();
	}
	public static void main(String args[]) {
		thismethodexample obj =new thismethodexample();
		obj.n();
	}
}
