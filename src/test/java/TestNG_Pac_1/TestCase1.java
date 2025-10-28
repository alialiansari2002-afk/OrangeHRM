package TestNG_Pac_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test...");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test..");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class...");
		
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class...");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method...");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method...\n");
	}
	
	@Test
	public void Test1() {
		System.out.println("Testcase1");
	}
	
	@Test
	public void Test2() {
		System.out.println("Testcase2");
	}
	
	
}
