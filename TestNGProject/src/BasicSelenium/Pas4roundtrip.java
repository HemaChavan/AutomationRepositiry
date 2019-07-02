package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Pas4roundtrip {

	
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
		WebElement ele = dr.findElementByName("passCount");
		Select sel = new Select(ele);
		sel.selectByIndex(0);
		//dr.close();
		dr.findElement(By.xpath("//input[@value='roundtrip']")).click();
		
		WebElement Pass = dr.findElementByName("passCount");
		Select PAss_count = new Select(Pass);
		PAss_count.selectByValue("4");
		
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
		airlinechk.selectByVisibleText("Blue Skies Airlines");
		
				
		dr.findElementByName("findFlights").click();
		
		dr.findElementByName("reserveFlights").click();
		
		dr.findElementByName("passFirst0").sendKeys("Hema");
		dr.findElementByName("passLast0").sendKeys("chavan");
		
		WebElement meal = dr.findElementByName("pass.0.meal");
		Select meal_pass = new Select(meal);
		meal_pass.selectByValue("HNML");
		
		dr.findElementByName("passFirst1").sendKeys("Test");
		dr.findElementByName("passLast1").sendKeys("Test");
		
		WebElement meal1 = dr.findElementByName("pass.1.meal");
		Select meal_pass1 = new Select(meal1);
		meal_pass1.selectByValue("HNML");
		
		dr.findElementByName("passFirst2").sendKeys("Test2");
		dr.findElementByName("passLast2").sendKeys("Test2");
		
		WebElement meal2 = dr.findElementByName("pass.2.meal");
		Select meal_pass2 = new Select(meal2);
		meal_pass2.selectByValue("HNML");
		
		dr.findElementByName("passFirst3").sendKeys("Test3");
		dr.findElementByName("passLast3").sendKeys("Test3");
		
		WebElement meal3 = dr.findElementByName("pass.3.meal");
		Select meal_pass3 = new Select(meal3);
		meal_pass3.selectByValue("HNML");
		
		
		WebElement CreditCard = dr.findElementByName("creditCard");
		Select cardtype = new Select(CreditCard);
		cardtype.selectByValue("AX");
		
		dr.findElementByName("creditnumber").sendKeys("12345");
		
		WebElement expirydatemonth = dr.findElementByName("cc_exp_dt_mn");
		Select expirydatemonth_card = new Select(expirydatemonth);
		expirydatemonth_card.selectByVisibleText("01");
		
		WebElement expirydateyear = dr.findElementByName("cc_exp_dt_yr");
		Select expirydateyear_card = new Select(expirydateyear);
		expirydateyear_card.selectByValue("2000");
		
		dr.findElementByName("cc_frst_name").sendKeys("hema");
		dr.findElementByName("cc_mid_name").sendKeys("latha");
		dr.findElementByName("cc_last_name").sendKeys("chavan");
		
		dr.findElementByName("billAddress1").clear();
		dr.findElementByName("billAddress1").sendKeys("Magarpatta City");
		dr.findElementByName("billCity").clear();
		dr.findElementByName("billCity").sendKeys("Pune");
		dr.findElementByName("billState").clear();
		dr.findElementByName("billState").sendKeys("chavan");
		dr.findElementByName("billZip").clear();
		dr.findElementByName("billZip").sendKeys("411028");
		
		WebElement country = dr.findElementByName("billCountry");
		Select billCountry = new Select(country);
		billCountry.selectByValue("92");
		
		dr.findElementByName("ticketLess").click();
		dr.findElementByName("buyFlights").click();
		//dr.findElementByLinkText("http://newtours.demoaut.com/mercurywelcome.php").click();
		
	//	dr.findElement(By.xpath("//a[@href='mercurywelcome.php']")).click();
	
	
	}

}
