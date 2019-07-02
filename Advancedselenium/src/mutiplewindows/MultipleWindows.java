package mutiplewindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(2000);
		String parent = dr.getWindowHandle();
		System.out.println(parent);
		
		dr.findElement(By.xpath("//img[@class='_3togXc']")).click();
		
		Set<String> wins = dr.getWindowHandles();
		for(String w :wins) {
			
			if(!parent.equals(w)) {
				dr.switchTo().window(w);
			}
			
			System.out.println(w);
		}
		
		dr.findElement(By.xpath("//input[@placeholder='Enter delivery pincode']")).sendKeys("1232");
		
		dr.findElement(By.xpath("//a[@class='_1TJldG _2I_hq9 _2UBURg']")).click();
		dr.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		
		String name = dr.findElement(By.xpath("//a[@class='_325-ji _3ROAwx']")).getText();
		
		if(name == "Tripr Men Colorblocked Casual Black, White Shirt") {
			dr.findElement(By.xpath("//button[@class='_2AkmmA _14O7kc _7UHT_c']")).click();
		}
		else
		{
			System.out.println("There is an error");
		}
		
		//dr.switchTo().window(parent);
	//	dr.close();
	//	dr.quit();

	}

}
