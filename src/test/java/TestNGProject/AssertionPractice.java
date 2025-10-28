package TestNGProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionPractice {
	
	WebDriver driver;
	
	@Test(priority=1)
	void Assertions() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Assertion fail
		//Assert.fail();
		
//		String expTitle="Automation Testing Practice";
//		String actTitle=driver.getTitle();
//		
//		//Assertion Equals
//		Assert.assertEquals(expTitle, actTitle);
//		
//		//Assertion True
//		Assert.assertTrue(1==2);	//test case fail
//		
//		//Assertion false
//		Assert.assertFalse(1==2);	//test case pass
//		
		
		//Assertion notEquals

		String ExpTitle="Automation Testing";
		String ActTitle=driver.getTitle();
		System.out.println("Actual Title: "+ActTitle);	//Actual title
			
		Assert.assertNotEquals(ExpTitle, ActTitle);	//test case pass
		
	}
	@Test(priority=2)
	void close() {
		driver.quit();
	}
	

}
