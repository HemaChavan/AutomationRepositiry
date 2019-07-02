package NewOOPS;

import java.util.ArrayList;

public class ArrayListImplementation {
	
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("hello");
		list.add("to java class");
		list.add("in techbodhi");
		
		for(String s : list)
		{
			System.out.println(s);
		}
		
		ArrayList list1 = new ArrayList<>();
		list1.add("hello");
		list1.add(2);
		list1.add(true);
		
		for(Object o : list1)
		{
			System.out.println(o);
		}
		
	}

}
