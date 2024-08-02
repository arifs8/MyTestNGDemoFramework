package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class4 {
	
	
	@BeforeClass
	public void beforeClassCode() {
		
		System.out.println("---------This will be printing before the class-----------");
	}
	
	@AfterClass
	public void afterClassCode() {
		
		System.out.println("---------This will be printing after the class-----------");
	}
	
	@Test(groups = {"Smoke"})
	public void webLoginHomeLoan() {
		
		//selenium	
		System.out.println("This is for Home Web Log in UI");
	}
	
	
	@Parameters({"loanURL","APIKey/usernmae"})
	@Test
	public void mobileLoginHomeLoan(String loanName, String userNameKey) {
		
		//Mobile Appium
		System.out.println("This is for Home Mobile Loan");
		System.out.println(loanName);
		System.out.println(userNameKey);
	}
	
	@Test
	public void apiLoginHomeLoan() {
		
		//Rest API 
		System.out.println("This is Home  API ");

	}
	
	@Test(dataProvider = "getData")
	public void apiLoginHomeLoan4(String usernmae1, String passwordname) {
		
		//Rest API 
		System.out.println("This is Home  API ");
		System.out.println(usernmae1);
		System.out.println(passwordname);
	}
	
	@DataProvider
	public Object[][]  getData() {
		
		//1st - combination - Usernmae,password
		//2nd combination - username,Password
		//3rd combination = Username,password
		
		Object[][] data = new Object[3][2];
		data[0][0]="first";
		data[0][1]="first";
		
		data[1][0]="first";
		data[1][1]="first";
		
		data[2][0]="first";
		data[2][1]="first";
		
		return data;
				
	}
	

	
	@AfterTest
	public void apiAfterTest() {
		
		//Rest API 
		System.out.println("This is Home  API - After test ");

	}
	
}
