package StepDefinitionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition 

{
	WebDriver driver;
	@When("I want to write a step with precondition")
	public void i_complete_action() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://www.fb.com");
	}

	@When("I complete action")
	public void some_other_action() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ajaykandapu@75gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("sjf8");
	}

	@When("some other action")
	public void yet_another_action() {
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	    
	}

	
}
