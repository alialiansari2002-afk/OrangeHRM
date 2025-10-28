package TestNGProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertion {
	
	  
	@Test
	void test() {
		
		//Assert is Class
		//assertEquals is methods
		
		//Compare with two values
		//Assert.assertEquals(123, 123);	//pass
		//Assert.assertEquals(123, 321);	//fail
		//Assert.assertEquals("ali", 123);	//fail
		//Assert.assertEquals("ali", "ali");	//pass
		
		//assertion true boolean return
		//Assert.assertTrue(true);	// my expectation is true and pass value true // test pass
		//Assert.assertTrue(false);	// my expectation is true and pass value false // test fail
		//Assert.assertTrue(1==2);	// my expectation is true and pass value false // test fail
		//Assert.assertTrue(1==1);	// my expectation is true and pass value true // test pass
		
		//assertion false boolean return
		//Assert.assertFalse(false);	// my expectation is false and pass value false // test pass
		//Assert.assertFalse(true);	// my expectation is false and pass value true // test fail
		//Assert.assertFalse(1==2);	// my expectation is false and pass value false // test pass
		//Assert.assertFalse(1==1);	// my expectation is false and pass value true // test fail
		
		//We want fail test method
		Assert.fail();	
		
				
	}

}
