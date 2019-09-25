package cucumber_gft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steplogin {
	WebDriver driver=null;
	@Given("Login page is opened")
	public void login_page_is_opened() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
		String url="http://10.232.237.143:443/TestMeApp";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters {string} as username and {string} as password")
	public void user_enters_as_username_and_as_password(String string, String string2) {
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
		driver.findElement(By.id("password")).sendKeys("Password123");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("Login")).click();
	}

	@Then("user will acess Homepage")
	public void user_will_acess_Homepage() {
	   
	}


}
