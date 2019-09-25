package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {
	
	WebDriver driver;
	By ln=By.xpath("//a[@href='/login']");
	By uname=By.id("Email");
	By pwd=By.id("Password");
	By li=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By lo=By.xpath("//a[@href='/logout']");
  
	
	public PageClass(WebDriver driver) {
		this.driver=driver;
	}
	public void Login() {
		driver.findElement(ln).click();
	}
	public void emailId(String username) {
		driver.findElement(uname).sendKeys("naghmanmehdi@gmail.com");
	}
	public void Password(String password) {
		driver.findElement(pwd).sendKeys("nmg12345");
		
	}
	public void Log() {
		driver.findElement(li).click();
	}
	public void logoff() {
		driver.findElement(lo).click();
	}
}
