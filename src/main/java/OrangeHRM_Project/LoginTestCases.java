package OrangeHRM_Project;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestCases {
	
	WebDriver driver;
	LoginPageFactory loginpage;
	//LoginPageFactory LoginPage=new LoginPageFactory(driver);
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority=1)
	void verifyLogin() {
		//Create Object with class name and --Login Action--
		LoginPageFactory LoginPage = new LoginPageFactory(driver);	// first class name "LoginPageFactory"
		LoginPage.loginToapp("Admin", "admin123");

		
		//Validation of test case
		String ActTitle = driver.getTitle();
		String ExpTitle = "OrangeHRM";
		Assert.assertEquals(ActTitle, ExpTitle);
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"login failed!");
		
		System.out.println("Login Successfull");
		
		
	}
	@Test(priority=2)
	void verifyLogout() {
		LoginPageFactory logoutpage = new LoginPageFactory(driver);
		//logout
		logoutpage.Logout();
				
		Assert.assertTrue(driver.getCurrentUrl().contains("auth/login"), "Logout failed!");
	}
	
	
}
