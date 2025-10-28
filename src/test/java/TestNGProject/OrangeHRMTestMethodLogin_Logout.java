package TestNGProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/*
 * 1.Login
 * 2.search
 * 3.Logout
 * 4.Login
 * 5.Admin Click
 * 6.Logout
 */

public class OrangeHRMTestMethodLogin_Logout {
	
	WebDriver driver;
	
	@BeforeSuite
	void setup() {
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@BeforeMethod
	void Login() {
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin1234");
		  WebElement Login =driver.findElement(By.xpath("//button[@type='submit']"));
		  Login.click();
		  String exp_title= driver.getTitle();
		  String act_title = driver.getTitle();
		  Assert.assertEquals(exp_title, act_title);
		  //Assert.assertTrue(driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).isDisplayed());
	
		 Assert.fail();
		 	 
	}
	
	
	@Test(priority=1)
	void Searchbox() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Time");
		driver.findElement(By.xpath("//span[text()='Time']")).click();
	}
	@Test(priority=2)
	void Admin() {
		WebElement clickAdmin= driver.findElement(By.xpath("//span[normalize-space()='Admin']"));
		clickAdmin.click();
		Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='User Management']")).isDisplayed());
	}
	@AfterMethod
	void Logout() {
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
	@AfterSuite
	void closeapp() {
		driver.quit();
	}
}
