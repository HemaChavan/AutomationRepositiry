package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps{
	ChromeDriver dr ;
	@Given("^Application page is up and running$")
	public void application_is_up_and_running()  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Techbodhi\\Drivers\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/");
	//	System.out.println("Application is up and running");
	    
	}
	@When("^I enter valid credentials$")
	public void i_enter_valid_credentials()  {
		
	    
	}
	
	@Then("^I should be login succesfully$")
	public void i_should_be_login_succesfully()  {
		System.out.println("Should be logged in succesfully");
	    
	}

	@When("^I enter (.*?) and (.*?) on login page$")
	public void enter_credentials(String username,String password) {
		dr.findElement(By.name("userName")).sendKeys(username);
		dr.findElement(By.name("password")).sendKeys(password);
		dr.findElementByName("login").click();
		
	}
	
	@Then("^the Error message should be displayed$")
	public void error_messages()  {
		//System.out.println("Should be getting an error message succesfully");
		dr.close();
	    
	}
	
	
}


//https://regex101.com/