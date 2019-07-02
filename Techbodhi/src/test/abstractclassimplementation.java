package test;

public class abstractclassimplementation extends abstractclass{

	@Override
	public void abstractmethod() {
		// TODO Auto-generated method stub
		System.out.println("abstract class which is overriden in implementation class");
	}
	public void abstractclassimplementationmethod() {
		System.out.println("Am in implementation class");
	}
	public void nonabstractmethod()
	{
		System.out.println("Am in implementation class");
	}

	public static void main(String[] args)
	{
		abstractclass ab = new abstractclassimplementation();
	//	abstractclass ab = new abstractclass(); cannot create the instance of abstract class
		ab.abstractmethod();
		ab.nonabstractmethod();
		abstractclassimplementation abimplement = new abstractclassimplementation();
		//abimplement.abstractclassimplementationmethod();
	}
}
