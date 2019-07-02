package NewOOPS;

public class string {
	public static void main(String[] args) {
		String name = "techbODhI";
		//CharAt
		System.out.println(name.charAt(3));
		System.out.println(name.length());
		System.out.println(name.trim());
		System.out.println(name.equals("techbodhi"));
		System.out.println(name.equalsIgnoreCase("Techbodhi"));
		System.out.println(name.replace("t", "z"));
	//	String name1[] = name.split("h");
	//	String[] name = new name[];
		for(int i=0 ;i<name.length();i++)
		{
			System.out.print(name.charAt(i)+"*");
		}
		System.out.println(name.substring(3));
		System.out.println(name.substring(2, 5));
		System.out.println(name.toLowerCase());
		//System.out.println(name.); count the number of repeaters 
		
	}

}
