package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class table_locator {
	
	
	@Test	
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Techbodhi\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/");
		dr.findElement(By.name("userName")).sendKeys("mercury");
		//dr.findElementByName("userName").sendKeys("hello");
		
		dr.findElementByName("password").sendKeys("mercury");
		dr.findElementByName("login").click();
		/*WebElement ele = dr.findElementByName("passCount");
		Select sel = new Select(ele);
		sel.selectByIndex(0);*/
		//dr.close();
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		
		WebElement Pass = dr.findElementByName("passCount");
		Select PAss_count = new Select(Pass);
		PAss_count.selectByValue("1");
		// sel = new Select(dr.findElementByName("passCount");
		 //sel.selectByValue("1");
		
		
		WebElement Depart = dr.findElementByName("fromPort");
		Select Departfrom = new Select(Depart);
		Departfrom.selectByValue("Sydney");
		
		WebElement Month = dr.findElementByName("fromMonth");
		Select MonthOn = new Select(Month);
		MonthOn.selectByValue("7");
		
		WebElement Date = dr.findElementByName("fromDay");
		Select DateOn = new Select(Date);
		DateOn.selectByValue("21");
		
		WebElement ToPort = dr.findElementByName("toPort");
		Select ToPortfrom = new Select(ToPort);
		ToPortfrom.selectByValue("Paris");
		
		WebElement Month1 = dr.findElementByName("toMonth");
		Select Monthto = new Select(Month1);
		Monthto.selectByValue("8");
		
		WebElement Date1 = dr.findElementByName("toDay");
		Select Dateto = new Select(Date1);
		Dateto.selectByValue("1");
		
		dr.findElement(By.xpath("//input[@value='Business']")).click();
		
		WebElement Airline = dr.findElementByName("airline");
		Select airlinechk = new Select(Airline);
		//airlinechk.selectByIndex(1);
		airlinechk.selectByVisibleText("Blue Skies Airlines");
				
		dr.findElementByName("findFlights").click();
		
		//2ndpage
		String str = dr.findElement(By.xpath("//font[@face='Arial, Helvetica, sans-serif'][@size='2']")).getText();
		System.out.println(str);
		
		//dr.findElementByName("reserveFlights").click();
		dr.findElementByCssSelector("input[name='reserveFlights']").click();   //css selectors
		
		dr.findElementByXPath("//input[@name='ticketLess']").click();
		System.out.println(dr.findElementByXPath("//input[@name='ticketLess']").isSelected());
	}
	

}
