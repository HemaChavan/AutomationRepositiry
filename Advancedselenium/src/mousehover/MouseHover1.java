package mousehover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Techbodhi\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com/");
		
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicit wait
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act = new Actions(dr);
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		WebDriverWait wait = new WebDriverWait(dr,10);
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='Shirts']")))); //Explicit wait
		dr.findElement(By.xpath("//a[text()='Shirts']")).click();
		

	}

}

//Explicit wait 				

//-wait for a specific property of an element
//-visibility of an element
//element to be clickable
//element to be enable etc
//- use for a specific element




//Implicit wait
//-wait for element to be present in dom
//-no such element found exception
//-once we start implicit wait - it will be applicable  to all the elements till the webdriver instance is alive