package cucumber_gft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver=null;

	@Given("user opens the  application")
	public void user_opens_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
			String url="http://10.232.237.143:443/TestMeApp";
			driver.get(url);
			driver.manage().window().maximize();
			
	}

	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
		driver.findElement(By.linkText("SignIn")).click();
	    
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.findElement(By.id("userName")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	    
	}

	@Then("Message displayed login successful")
	public void message_displayed_login_successful() {
		driver.findElement(By.name("Login")).click();
		driver.close();
	  
	}


}
