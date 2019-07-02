//links and partial links
package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumclass3 {
	
	
		@Test	
		public void login() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Techbodhi\\Drivers\\chromedriver.exe");
			ChromeDriver dr = new ChromeDriver();
			dr.manage().window().maximize();
			dr.get("http://newtours.demoaut.com/");
			dr.findElement(By.linkText("REGISTER")).click();
			Thread.sleep(3000);
			dr.findElement(By.partialLinkText("SUPP")).click();
			String width = dr.findElement(By.xpath("//img[@alt='Mercury Tours']")).getAttribute("width");
			String height = dr.findElement(By.xpath("//img[@alt='Mercury Tours']")).getAttribute("height");
			System.out.println(width);
			System.out.println(height);
	}
	
	

}
