package cimbapiautomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredCimbTest extends cimbApiAutomation{
	
	
	@Test(priority=1)
	public void VerifyResponseCode() 
	{
		int statuscode=RestAssured.given().get().getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
	}
	
	@Test(priority=2)
	public void VerifyResponseBody() 
	{
		String reponsebody=RestAssured.given().get().asString();
		System.out.print(reponsebody);
		
	}
	
	
	@Test(priority=3)
	public void VerifyResponseTime()
	{
	long time=RestAssured.given()
			.get()
			.getTime();
	
	System.out.println("Response Time "+time);
	
		
	}
	
	

}
