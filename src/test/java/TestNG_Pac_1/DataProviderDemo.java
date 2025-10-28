package TestNG_Pac_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	//1.India Qutub minar
	//2.Agra Taj Mahal
	//3.Hydrabad Charminar
	
	@DataProvider(name = "searchdata")
	public Object[][] searchData(){
		Object[][] searchKey = new Object[3][2];
		
		searchKey[0][0] = "India";
		searchKey[0][1] = "Qutub Minar";
		

		searchKey[1][0] = "Agra";
		searchKey[1][1] = "Taj Mahal";
		

		searchKey[2][0] = "Hydrabad";
		searchKey[2][1] = "Charminar";
		
		return searchKey;
	}
	
	
	
	@Test(dataProvider = "searchdata")
	public void TestcaseGoogleSearch(String country, String monument) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(country+" "+monument);
		
		driver.findElement(By.name("btnK")).submit();
		
	}

}
