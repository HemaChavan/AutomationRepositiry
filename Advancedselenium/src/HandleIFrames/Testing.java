package HandleIFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Techbodhi\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://paytm.com/");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		//Thread.sleep(1000);
	//	dr.switchTo().frame(0);
		dr.switchTo().frame(dr.findElement(By.tagName("iframe")));
		Thread.sleep(1000);
		dr.switchTo().defaultContent();//for going back to original frame
		dr.findElement(By.xpath("a[@title='Close']")).click();
		Thread.sleep(1000);
		
		
	
		//dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click(); - will not work as it is frame

	}

}

//Iframes can be identified with dr.switchTo().frame(0);
//cannot use string  as there is no name  

