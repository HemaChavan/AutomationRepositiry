package test;

public class stringmethods {
	public static void main(String args[])
	{
		String s1 = " Techbodhi institution teaches both Java and Selenium ";
		
		int i=s1.length();
		System.out.println("string length is " + i);
		
		char s2 = s1.charAt(3);
		System.out.println("char at index 4 is " + s2);
		
		String s3 = s1.substring(12);
		System.out.println("Substring with single variable :"+s3);
		
		String s4 = s1.substring(2, 24);
		System.out.println("Substring with double variables is:"+s4);
		
		Boolean s5 = s1.contains("teach"); ///checks with the word available in string
		System.out.println("Check the Contains is :"+s5);
				
		//Checks with the full string same to same
		Boolean s6 = s1.equals("Techbodhi institution teaches both Java and Selenium");
		System.out.println("Checks the Equal method:"+s6);
		
		int s7 = s1.indexOf("teaches");
		System.out.println("Checks the index of"+s7);
		
		int s8 = s1.indexOf("o",20);
		System.out.println("To check the index of with 2 parameters"+s8);
		
		int s9 = s1.lastIndexOf("z");
		System.out.println("To check the last index of "+s9);
		
	//	String s1 = "Techbodhi institution teaches both Java and Selenium";
		//splits  where ever it encounters "i"
		String[] s10 = s1.split("i");
		for(String s11 : s10)
		System.out.println(s11);
		
		String s12 = String.join("/","12","22","2019");
		System.out.println(s12);
		
		String s13 = s1.concat(" in Pune");
		System.out.println(s13);
		
		String s14 = s1.replace(" ","//");
		System.out.println(s14);
		
		String s20 = s1.trim();
		System.out.println("After trim the string displays as:"+s20);
		
		String s15 = s1.toUpperCase();
		System.out.println(s15);
		
		String s16 = s1.toLowerCase();
		System.out.println(s16);
	}

}
