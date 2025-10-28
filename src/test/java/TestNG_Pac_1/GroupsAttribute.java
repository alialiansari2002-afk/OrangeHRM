package TestNG_Pac_1;

import org.testng.annotations.Test;

public class GroupsAttribute {
	
	@Test(groups="Animal")
	public void cat() {
		System.out.println("cat");
	}
	
	@Test(groups="Animal")
	public void horse() {
		System.out.println("horse");
	}
	
	@Test(groups="Animal")
	public void Elephant() {
		System.out.println("Elephant");
	}
	
	@Test(groups="Fruits")
	public void banana() {
		System.out.println("banana");
	}
	
	@Test(groups="Fruits")
	public void Apple() {
		System.out.println("Apple");
	}
	
	@Test(groups="Fruits")
	public void Mango() {
		System.out.println("Mango");
	}
	

	

}
