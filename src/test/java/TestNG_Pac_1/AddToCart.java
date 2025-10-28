package TestNG_Pac_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddToCart {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
	}
	@Test(priority=1, groups = {"smoke"})
	public void verifyHomepageTitle() {
		//String actualTitle=driver.getTitle();
		String expectTitle = "Your Store";
		Assert.assertEquals(driver.getTitle(), expectTitle);
		System.out.println(driver.getTitle());
	}
	@Test(priority=2, groups = {"smoke"})
	public void LOginBtnTest() {
		driver.findElement(By.linkText("My Account")).click();
		WebElement LoginBtn = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
		Assert.assertTrue(LoginBtn.isDisplayed());
	}
	
	@Test(priority=3, groups = {"sanity"})
	public void LoginTest() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("wwwwww@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Account']")).isDisplayed());
		
	}
	@Test(priority=4, groups = {"sanity"})
	public void SearchBoxTest() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iPhone");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Search - iPhone");
		
	}
	@Test(priority=5, groups= {"Integration"})
	public void AddToCartandCheckOutTest() {
		driver.findElement(By.xpath("//a[normalize-space()='Phones & PDAs']")).click();
		driver.findElement(By.xpath("(//span[text()='Add to Cart'])[2]")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).isDisplayed());
	}
	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
