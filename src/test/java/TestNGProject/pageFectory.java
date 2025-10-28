package TestNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageFectory {
	
	WebDriver driver;
	
	pageFectory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']") WebElement username;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//button[@type='submit']") WebElement login;
	
	public void email(String user) {
		username.sendKeys(user);
	}
	public void password(String pin) {
		password.sendKeys(pin);
	}
	public void login() {
		login.click();
	}
	

}
