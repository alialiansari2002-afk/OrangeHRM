package OrangeHRM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	//Create Constructor
	WebDriver driver;
	LoginPageFactory(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	//Create locators
	@FindBy(xpath="//input[@name='username']") WebElement username;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//button[@type='submit']") WebElement loginButton;
	
	@FindBy(xpath="//span[text()='Admin']") WebElement Admin;
	
	//Logout
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']") WebElement logout;
	@FindBy(xpath="//a[text()='Logout']") WebElement clicklogout;
	
	//Forgot your password? 
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']") WebElement forgotpassword;
	@FindBy(xpath="//input[@name='username']") WebElement EntUsername;
	@FindBy(xpath="//button[text()=' Reset Password ']") WebElement ResetPassword;
	
	
	//Create Actions
	public void login(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();
	}
		public void admin() {
		Admin.click();
	}
	public void Logout() {
		logout.click();
		clicklogout.click();
		
	}
	public void forgotPassword(String entusername) {
		forgotpassword.click();
		EntUsername.sendKeys(entusername);
		ResetPassword.click();
	}
	
	

}
