package TestNGProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationClass {
	
	
	@BeforeClass
	void Login() {
		System.out.println("THis is login");
	}
	@Test(priority=1)
	void search() {
		System.out.println("THis is search");
	}
	@Test(priority=2)
	void avSearch() {
		System.out.println("This is Ad search");
	}
	@AfterClass
	void logout() {
		System.out.println("this is logout");
	}
	

}
