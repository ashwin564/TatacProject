package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tatocsteps
{
	 WebDriver driver;

	@Given("^I launch Chromedriver$")
	public void I_launch_Chromedriver()
	{
		System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
 
	@When("^I Launch tatoc Home page$")
	public void I_Launch_tatoc_Home_page()
	{
		driver.get("http://10.0.1.86/tatoc");
	}
 
 
	@Then("^I verify All Basic Tatoc Task$")
	public void I_verify_All_Basic_Tatoc_Task()  
	{
		driver.findElement(By.xpath("/html/body/div/div[2]/a[1]")).click();
	}

}
