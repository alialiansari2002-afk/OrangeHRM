package TestNGProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionotEquals {
	
	WebDriver driver;
	
	@Test
	void AssertNotEquals() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		String Exp_Title = "orangeHRM";
//		String Act_Tilte = driver.getTitle();
//		
//		System.out.println(Act_Tilte);
//		
//		//Assert.assertNotEquals(Exp_Title, Act_Tilte);

		//Assert.assertTrue(123<=123);
		
		Assert.assertFalse(123==124);
	}

}
