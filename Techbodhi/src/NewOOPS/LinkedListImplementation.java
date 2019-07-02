package NewOOPS;

import java.util.LinkedList;

public class LinkedListImplementation {
	
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<>();
		list.add("hello");
		list.add("hello");
		list.add("hello");
		
		for(String s : list)
		{
			System.out.println(s);
		}
		
		
	}

}
