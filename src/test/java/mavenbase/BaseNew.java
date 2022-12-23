package mavenbase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import mavennew.Utilitynew;




public class BaseNew {
	protected WebDriver driver;

	public void launchbrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium downlod\\selenium-java-4.4.0\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Utilitynew.readDataFromPropertyFile("URL"));
		driver.manage().window().maximize();
		Utilitynew.wait(driver, 1000);
		Reporter.log("launch browser ", true);
	}
	public static void closingBrowser(WebDriver driver) throws 
	InterruptedException
	{
	Reporter.log("closing browser", true);
	Thread.sleep(500);
	driver.close();
}
}
