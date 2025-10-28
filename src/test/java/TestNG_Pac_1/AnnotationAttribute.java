package TestNG_Pac_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationAttribute {
	
	//@Test(timeOut=200)	//timeOut attribute
	
	//@Test(priority=2)
	@Test(description="testcase2")
	public void test2() {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("TEST-1 ANNOTATION ATTRIBUTE");
	}
	
	//@Test(description="this is test2")
	
	//@Test(priority=3)
	
	@Test(dependsOnMethods= {"test1"})	//comma se multiple testcase le sakte hai(test1,test4)
	public void test3() {
		
		System.out.println("TEST-2 ANNOTATION ATTRIBUTE");
	}
	
	//@Test(description="this is test3")
	
	@Test(priority=1)
	public void test1() {
		Assert.assertTrue(false);
		System.out.println("TEST-3 ANNOTATION ATTRIBUTE");
	}
	@Test
	public void test4() {
		System.out.println("TEST-4 ANNOTATION ATTRIBUTE");
	}

}
