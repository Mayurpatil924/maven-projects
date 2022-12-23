package maventestng;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mavenbase.BaseNew;
import mavennew.Neostoxnewlogin;
import mavennew.Utilitynew;
import mavennew.homepagenew;
import mavennew.passwordnew;

public class neotestngnew extends BaseNew {
	Neostoxnewlogin login;
	passwordnew password;
	homepagenew home;
	@BeforeClass
	public void launchNeoStox() throws IOException
	{
		launchbrowser();
	login= new Neostoxnewlogin(driver);
	password= new passwordnew(driver);
	home= new homepagenew(driver);
	}
	@BeforeMethod
	public void loginToNeoStox() throws IOException, InterruptedException
	
	{
	login.sendMobileNum(driver, Utilitynew.readDataFromPropertyFile("MobileNum") );
	login.clickOnSignInButton(driver);
	Thread.sleep(1000);
	password.sendPassword(driver, 
	Utilitynew.readDataFromPropertyFile("Password"));
	password.clickOnSubmitButton(driver);
	Thread.sleep(1000);
	home.popUpHandle(driver);
	}
	@Test
	 public void validateUserName() throws IOException 
	{
	Assert.assertEquals(home.getUserName(), 
	Utilitynew.readDataFromPropertyFile("userName"),"TC failed, actual and expected User Names are not matching");
	Utilitynew.takeSceenshot(driver, home.getUserName());
	 }
	@AfterMethod
	public void logout()
	{
	home.logoutFormNeoStox(driver);
	}
	@AfterClass
	public void closeApplication() throws InterruptedException
	{
	closingBrowser(driver);
  }
}
