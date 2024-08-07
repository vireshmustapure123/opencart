package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegestrationPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class Tc_001_AccountRegisterTest extends BaseClass{

	@Test
	public void RegisterTest(){
		
		
		
		HomePage hm = new HomePage(driver);
		hm.clickMyAccount();
		hm.clickRegister();
		
		AccountRegestrationPage ar = new AccountRegestrationPage(driver);
		
		ar.setFirstName(randomeString().toUpperCase());
		ar.setLastName(randomeString().toUpperCase());
		ar.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		ar.setTelephone(randomeNumber());
String password=randomAlphaNumeric();
		
		ar.setPassword(password);
		ar.setconformpassword(password);
		
		ar.setPrivacyPolicy();
		ar.clickContinue();
		
		String confmsg=ar.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
