package test;

public class dowhileprog {
	
	public void dowhileprg_func() {
		int i = 3;
		do
		{
			System.out.println("values of i are" + i);
			i--;
			
		}while(i>3);
		
	}
	public static void main(String args[]) {
		dowhileprog obj = new dowhileprog();
		obj.dowhileprg_func();
	}
	

}


//For the false conditions do-while print and then checks condition ;
// while loop checks the conditions and then prints
//For true conditions do-while and while works similar