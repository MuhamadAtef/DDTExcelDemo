package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageBase
{
	private WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}


	@FindBy(css="a.ico-register")
	WebElement registerLink ; 

	@FindBy(linkText="Log in")
	WebElement loginLink; 
	

	
	public void openRegistrationPage() 
	{
		clickButton(registerLink);
	}
	
	public void openLoginPage() 
	{
		clickButton(loginLink);
	}
	

	

	

}
