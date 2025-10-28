package TestNG_Pac_1;

import org.testng.annotations.Test;

public class LoanDepartment {
	
	@Test	// ye wali execute nahi hogi becose disable kar diya hai
	public void WebLoginPersonalLoan() {
		System.out.println("Web login personal loan");
	}
	
	@Test
	public void MobileLoginPersonalLoan() {
		System.out.println("Mobile login personal loan");
	}
	
	@Test
	public void ApiLoginPersonalLoan() {
		System.out.println("API login personal loan");
	}
	
	@Test
	public void WebLoginAutomobileLoan() {
		System.out.println("Web login Automobile loan");
	}
	
	@Test
	public void MobileLoginAutomobileLoan() {
		System.out.println("Mobile login Automobile loan");
	}
	
	@Test
	public void ApiLoginAutomobileLoan() {
		System.out.println("API login Automobile loan");
		
		
	}

}
