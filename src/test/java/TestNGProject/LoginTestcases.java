package TestNGProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestcases {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test
	void login() {
		pageFectory p = new pageFectory(driver);
		p.email("rustam@gmail.com");
		p.password("1234");
		p.login();
		
		String expTitle = "orangeHRM";
		String actTitle = driver.getTitle();
		Assert.assertEquals(expTitle, actTitle);
		
	}
	

}
