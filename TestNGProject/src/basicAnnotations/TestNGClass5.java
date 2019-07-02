package basicAnnotations;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGClass5 {
	
	@Test(dataProvider = "getdata")
	public void test(String r , String c)
	{
		
		System.out.println("Enter username"+r);
		System.out.println("Enter password"+c);
		System.out.println("Click on Login Button ");
	}
	
	@DataProvider
	public String[][] getdata() throws IOException
	{
		Xls_Reader xl = new Xls_Reader("C:\\Users\\Hemz\\eclipse-workspace\\TestNGProject\\src\\Testdata\\test_excel.xls");
		int rows = xl.getrowcount("Sheet1");
		int col = xl.getColumncount("Sheet1");
		
		
		String[][] data = new String[rows-1][col];
		for(int r=2 ; r<= rows ;r++)
		{
			for(int c =1 ;c<= col ;c++)
			{
				data[r-2][c-1] = xl.getCellData("Sheet1", r, c);
			}
				
		}
		return data;
						
	}
}
