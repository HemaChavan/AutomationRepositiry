package basicAnnotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGClass4 {
	
	@Test(dataProvider = "getdata")
	public void test(String username , String password)
	{
		
		System.out.println("Enter username"+username);
		System.out.println("Enter password"+password);
		System.out.println("Click on Login Button ");
	}
	
	@DataProvider
	public String[][] getdata()
	{
		String[][] data = new String[5][2];
		//Row0
		data[0][0] = "U1";
		data[0][1] = "P1";
		
		//Row1
		data[1][0] = "U2";
		data[1][1] = "P2";
		
		//Row2
		data[2][0] = "U3";
		data[2][1] = "P3";
		
		//Row3
		data[3][0] = "U4";
		data[3][1] = "P4";
		
		//Row4
		data[4][0] = "U5";
		data[4][1] = "P5";
		
		return data;
						
	}
}
