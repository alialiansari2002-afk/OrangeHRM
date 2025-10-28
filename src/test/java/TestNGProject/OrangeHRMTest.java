package TestNGProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRMTest {
	
	WebDriver driver;
	
  @BeforeMethod
  void Setup() {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
  }
  @Test(priority=1)
  void LogoTest() throws InterruptedException {
	  Thread.sleep(3000);
	  boolean status= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  System.out.println("Logo is display..."+status);
  }
  @Test(priority=2)
  void LoginTest() {
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  WebElement Login =driver.findElement(By.xpath("//button[@type='submit']"));
	  Login.click();
	  Assert.assertTrue(driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).isDisplayed());
  }
  @AfterMethod
  void closeapp() {
	  driver.quit();
  }
}
