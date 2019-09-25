package POMwithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		PageClass pc=PageFactory.initElements(driver, PageClass.class);
		driver.manage().window().maximize();
		pc.LoginProcess("naghmanmehdi@gmail.com", "nmg12345");
		Thread.sleep(2000);
		driver.close();
  }
}
