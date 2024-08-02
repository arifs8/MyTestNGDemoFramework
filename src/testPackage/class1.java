package testPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class1 {

	@Test(groups = {"Smoke"})
	public void demo() {
		
		System.out.println("This is the demo project to check the TestNG annotations are working properly");
	}
	
	@Test
	public void secondDemo1() {
		
		System.out.println("This is the second test method");
	}
	
	@BeforeTest
	public void tbeforeTestCase() {
		
		System.out.println("This is the before test execution");
	}
	
	
}
