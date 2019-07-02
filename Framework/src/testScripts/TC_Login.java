package testScripts;


import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import configuration.Config;
//import excelfilemanipulation.Xls_Reader;
import libraries.*;
import pages.FlightFinder;
import pages.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



@Test
public class TC_Login {

	WebDriver dr;
	ApplicationLibrary lib;
	@BeforeMethod
	public void initialise() {
			lib = new ApplicationLibrary();
		 dr = lib.launchBrowser();
		 assertTrue(dr!=null);
		
	}
	
	/*public  void script() {
		
		
		//Navigate to URL
		String res = lib.navigate(dr, Config.applicationURL);
		assertTrue(res.contains("Mercury Tours"));
		
				
		//Login page
		HomePage page = new HomePage(dr);
		
		
		
		page.login("mercury","mercury");
		
		FlightFinder page2 = new FlightFinder(dr);
		assertTrue(lib.isElementPresent(dr, page2.oneway));
		
		//page.clickRegister();
		
		
		
		
	}*/
	
	/* data from excel */
	@Test(dataProvider = "getdata")
	public void test(String username , String password)
	{
		
		//Navigate to URL
				String res = lib.navigate(dr, Config.applicationURL);
				assertTrue(res.contains("Mercury Tours"));
				
						
				//Login page
				HomePage page = new HomePage(dr);
				
				
				
				page.login(username,password);
				
				FlightFinder page2 = new FlightFinder(dr);
				assertTrue(lib.isElementPresent(dr, page2.oneway));
				
				//page.clickRegister();
				
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
				
				System.out.println(data[r-2][c-1]);
				
			}
				
		}
		return data;
						
	}


	  
	 
	@AfterMethod
	public void teardown() {
		dr.quit();
		
	}

}

//Add testng library first 
//add testng assert.asserTrue