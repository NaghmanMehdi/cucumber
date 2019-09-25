package POMwithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageClass {
	WebDriver driver;
	@FindBy(how=How.CLASS_NAME,using="ico-login")WebElement Login;
	@FindBy(how=How.ID,using="Email")WebElement username;
	@FindBy(how=How.ID,using="Password")WebElement password;
	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")WebElement Submit;
	public PageClass (WebDriver driver) {
		this.driver=driver;
	}
public void LoginProcess(String uname,String pwd) {
	Login.click();
	username.sendKeys(uname);
	password.sendKeys(pwd);
	Submit.click();
}
}
