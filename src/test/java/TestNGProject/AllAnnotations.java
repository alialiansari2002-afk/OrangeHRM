package TestNGProject;

import org.testng.annotations.*;

public class AllAnnotations {
	
	@BeforeSuite
	void beforSuite() {
		System.out.println("THis is BeforeSuite");
	}
	@AfterSuite
	void AfterSuite() {
		System.out.println("THis is AfterSuite");
	}
	@BeforeTest
	void beforTest() {
		System.out.println("THis is BeforeTest");
	}
	@AfterTest
	void AfterTest() {
		System.out.println("THis is AfterTest");
	}
	@BeforeClass
	void beforClass() {
		System.out.println("THis is BeforeClass");
	}
	@AfterClass
	void AfterClass() {
		System.out.println("THis is AfterClass");
	}
	@BeforeMethod
	void BeforeMethod() {
		System.out.println("THis is BeforeMethod");
	}
	@AfterMethod
	void AfterMethod() {
		System.out.println("THis is AfterMethod");
	}
	@Test(priority=1)
	void Test1() {
		System.out.println("THis is Test1");
	}
	@Test(priority=2)
	void Test2() {
		System.out.println("THis is Test2");
	}

}
