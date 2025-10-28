package OrangeHRM_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestCases {
	
	WebDriver driver;
	LoginPageFactory LoginPage=new LoginPageFactory(driver);
	
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
		//LoginPageFactory LoginPage = new LoginPageFactory(driver);	// first class name "LoginPageFactory"
		LoginPage.login("Admin", "admin123");

		
		//Validation of test case
		String ActTitle = driver.getTitle();
		String ExpTitle = "OrangeHRM";
		Assert.assertEquals(ActTitle, ExpTitle);
		
		System.out.println("Login Successfull");
	}
	@Test(priority=2)
	void Admin() {
		LoginPageFactory pf = new LoginPageFactory(driver);
		pf.admin();
		//validation of admin page..
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']//h6[text()='Admin']")).isDisplayed());
		
	}
	@Test(priority=3)
	void logout() {
		//LoginPageFactory pf = new LoginPageFactory(driver);
		LoginPage.Logout();
		LoginPage.Logout();
	}
	@Test(priority=4)
	void forgotpassword() {
		LoginPage.forgotPassword("Admin");

	}

}
