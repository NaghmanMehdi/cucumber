package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	PageClass pc=new PageClass(driver);
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	pc.Login();
	String username=null;
	pc.emailId(username);
	String password=null;
	pc.Password(password);
	pc.Log();
	pc.logoff();
	driver.close();
	
	
}
}
