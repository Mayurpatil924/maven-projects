package mavennew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class passwordnew
{
	@FindBy (id = "txt_accesspin") private WebElement passwordFiled;
	@FindBy(xpath = "//a[text()='Submit']") private WebElement submitButton;
	public  passwordnew(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void sendPassword(WebDriver driver,String Password)
	{
	Utilitynew.wait(driver, 1000);
	passwordFiled.sendKeys(Password);
	//Reporter.log("sending password", true);
	}
	public void clickOnSubmitButton(WebDriver driver)
	{
	Utilitynew.wait(driver, 1000);
	submitButton.click();
	//Reporter.log("Clicking on submit button", true);

}
}
