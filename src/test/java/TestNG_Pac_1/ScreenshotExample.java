package TestNG_Pac_1;


import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotExample {

	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
	}
	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	@Test	
	public void screenshot() {	
		//WebElement image= driver.findElement(By.xpath("//a[text()='Qafox.com']"));
		WebElement image= driver.findElement(By.xpath("//div[@id='content']"));
		
		/*

        // Step 2: Capture Screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Step 3: Save Screenshot to Location
        FileUtils.copyFile(screenshot, new File("C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\TestNG\\\\screenshot\\\\screen.png"));
*/
		
		//Step 2: Capture Screenshot
		File screeshot = image.getScreenshotAs(OutputType.FILE);	// file format me change kiya hai
		// Step 3: Save Screenshot to Location
		File targetfile = new File("C:\\Users\\Lenovo\\eclipse-workspace\\TestNG\\screenshot\\screen2.png");	//us file ko kaha save karna hai 
		//store screenshot
		screeshot.renameTo(targetfile);	//	yaha pe screenshot liya and paste kar diya target place pe
		

		
	}

}
