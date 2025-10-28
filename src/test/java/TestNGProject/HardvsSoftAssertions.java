package TestNGProject;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions {
	
/*	//@Test
	void Test_HardAssertion() {
		System.out.println("Test 1....");
		System.out.println("Test 2....");
		
		Assert.assertEquals(1, 2);	
		
		//if Assertion is failed rest statements will not be executed
		
		System.out.println("Test 3....");
		System.out.println("Test 4....");
	}*/
	@Test
	void Test_softAssertion() {
		System.out.println("Test 1....");
		System.out.println("Test 2....");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);	
		
		//if Assertion is failed rest statements will not be executed
		
		System.out.println("Test 3....");
		System.out.println("Test 4....");
		
		sa.assertAll();
	}

}
