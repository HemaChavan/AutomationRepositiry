//in buildpath added selenium jar files from D:Techbodhi/Jarfiles

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class combobox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Techbodhi\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("file:///D:/Techbodhi/Practice.html");
		WebElement web = dr.findElement(By.id("anand")); 
		Select sel = new Select(web);
		
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		sel.deselectByIndex(0);
		
	

	}

}
