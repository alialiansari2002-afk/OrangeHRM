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
	@FindBy(xpath="//input[@name='username']") WebElement usernameField;
	@FindBy(xpath="//input[@name='password']") WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']") WebElement loginBtn;
	
	
	//Logout
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']") WebElement userDropdown;
	@FindBy(xpath="//a[text()='Logout']") WebElement logoutlink;
	
	// Actions
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginBtn.click();
    }
	
	//login actions
	public void loginToapp(String uname, String pwd) {
		enterUsername(uname);
		enterPassword(pwd);
		clickLogin();
	}
	
	//logout actions
	public void Logout() {
		userDropdown.click();
		logoutlink.click();
		
	}
		

}
