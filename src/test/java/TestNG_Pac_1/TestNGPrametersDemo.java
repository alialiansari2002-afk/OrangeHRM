package TestNG_Pac_1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGPrametersDemo {
	
	
	@Test
	@Parameters({"i","j"})
	public void add(int a, int b) {
		System.out.println("add: "+(a+b));
	}
	
	
	@Test
	@Parameters({"i","j"})
	public void substraction(int a, int b) {
		System.out.println("subs "+(a-b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void multiplication(int a, int b) {
		System.out.println("multiply: "+(a*b));
	}

}
