package practice_session;

public class super_this_contd extends super_this{

	int a,b ,c;
	public void child(int x,int y ) {
		this.a=x;
		this.b=y;
		
	}
	public void disp()
	{
		super.parent();
		this.child(2,3);
		c=a+b;
		
		System.out.println("value of c is"+c);
	}
	
	public static void main(String[] args) {
		super_this_contd c1 = new super_this_contd();
		c1.disp();
		
		
	}	
		

	}





