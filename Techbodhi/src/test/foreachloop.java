package test;

public class foreachloop {

	public void ForEachLoop_func()
	{
		int arr[] = {12,23,44,56,77};
		for(int i:arr) {
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		foreachloop obj = new foreachloop();
		obj.ForEachLoop_func();
	}
	
}