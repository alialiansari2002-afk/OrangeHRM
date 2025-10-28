package TestNGProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGClass_1 {
	WebDriver driver;
	
	@BeforeSuite
	void setup() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("App open");
	}
	@Test(priority=1)
	void login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		WebElement Login =driver.findElement(By.xpath("//button[@type='submit']"));
		Login.click();
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).isDisplayed());
	}
	@Test(priority=2)
	void ClickOnAdmin() {
		WebElement clickAdmin= driver.findElement(By.xpath("//span[normalize-space()='Admin']"));
		clickAdmin.click();
		Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='User Management']")).isDisplayed());
		
	}
	@Test(priority=3)
	void UserManagementDetails() throws InterruptedException {
		List <WebElement> userinput=driver.findElements(By.xpath("//input[@class='oxd-input oxd-input--active']"));
		userinput.get(1).sendKeys("Alice Smith");
		
		List <WebElement> userRole=driver.findElements(By.xpath("//div[@class='oxd-select-text-input']"));
		userRole.get(0).click();
		Actions act = new Actions(driver);
		act.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN)
		.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		
		WebElement EmpName= driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		EmpName.sendKeys("Alice Smith");
		
		List <WebElement> Status=driver.findElements(By.xpath("//div[@class='oxd-select-text-input']"));
		Status.get(1).click();
		//Actions acts= new Actions(driver);
		act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	}
	@Test(priority=4)
	void Reset() {
		WebElement resetBtn=driver.findElement(By.xpath(" //button[text()=' Reset ']"));
		resetBtn.click();
	}
	@AfterSuite
	void closeURL() {
		driver.quit();
	
	}

}
