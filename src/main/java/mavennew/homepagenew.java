package mavennew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class homepagenew 
{
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement okButton;
	@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement closeButton;
	@FindBy(id = "lbl_username") private WebElement userName;
	@FindBy(id="lbl_curbalancetop") private WebElement balance;
	@FindBy(xpath = "//span[text()='Logout']") private WebElement logoutButton;
	public homepagenew(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void popUpHandle(WebDriver driver)
	{
	Utilitynew.wait(driver, 1000);
	okButton.click();
	Utilitynew.scrollIntoView(driver, closeButton);
	Utilitynew.wait(driver, 1000);
	closeButton.click();
	
	}
	public String getUserName()
	{
	String actualUserName = userName.getText();
	//Reporter.log("getting user Name",true);
	return actualUserName;
	}
	public String getBalance(WebDriver driver)
	{
	Utilitynew.wait(driver, 1000);
	String actualBalance = balance.getText();
	//Reporter.log("getting actual balance",true);
	return actualBalance;
	}
	public void logoutFormNeoStox(WebDriver driver)
	{
    Utilitynew.wait(driver, 1000);
    userName.click();
	Utilitynew.wait(driver, 1000);
	logoutButton.click();
	//Reporter.log("Loggoing out from neoStox",true);

}
}
