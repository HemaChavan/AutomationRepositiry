package polymorphism;

public class Bank {

	public static void main(String  args[])
	{
		RBIBank rbi = new RBIBank();
		ICICI ic = new ICICI();
		HDFC hd = new HDFC();
		rbi.ROI();
		ic.ROI();
		hd.ROI();
	}
}
