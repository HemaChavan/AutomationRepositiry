package keywords;

public  class  StaticBlockExample {

	static int num;
	static String abc;
	
	static {
		int x =22;
		num = 121;
		abc = "Hello";
	}
	public static void main(String args[]) {
		
		System.out.println("the value of  num is:"+num);
		System.out.println("the value of  string is:"+abc);
		
	}
	
}
