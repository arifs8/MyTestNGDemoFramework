package testPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class3 {
	
	

	
	@Test
	
	public void webLoginCarLoan() {
		
		//selenium	
		System.out.println("This is for Web Log in UI");
		
	}
	
	@BeforeSuite
	public void beforeSuiteCode() {
		
		System.out.println("This is the number one thing to execute before suite");
	}
	
	@BeforeMethod
	public void beforeMethodCode() {
		
		System.out.println();
		System.out.println("XXXXXXXXXXXXX I wil  be ruinning before all the test cases. XXXXXXXXXXXXXXX");
	}
	
	@AfterMethod
	public void afterMethodCode() {
		
		System.out.println("XXXXXXXXXXXXX I wil  be ruinning after  all the test cases. XXXXXXXXXXXXXXX");
		System.out.println();
	}
	
	
	
	@AfterSuite
	public void afterSuiteCode() {
		
		System.out.println("This is the number one last thing to execute after suite");
	}
	
	
	@Test
	public void mobgileLoginCarLoan() {
		
		//Mobile Appium
		System.out.println("This is for Mobile Loan");
	}
	
	
	
	//@Parameters({ "URL" })
	@Test
	
	public void apiLoginCarLoan() {
		
		//Rest API 
		System.out.println("This sis for API ");
		//System.out.println(urlName);
	}

}
