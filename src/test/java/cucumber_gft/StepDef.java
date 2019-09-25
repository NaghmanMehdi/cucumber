package cucumber_gft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver=null;
	@Given("The login page is opened")
	public void the_login_page_is_opened() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://10.232.237.143:443/TestMeApp";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters lalitha as username")
	public void user_enters_lalitha_as_username() {
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
		   
	}

	@When("user enters password{int} as password")
	public void user_enters_password_as_password(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("Password123");
	}

	@Then("user will find testme app Home Page")
	public void user_will_find_testme_app_Home_Page() {
		driver.findElement(By.name("Login")).click();
	}

}
