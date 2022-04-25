package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{

	private By email = By.id("Email");
	private By password = By.id("Password");
	private By loginButton = By.className("login-button");


	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="Email")
	WebElement emailTxtBox ; 

	@FindBy(id="Password")
	WebElement passwordTxtBox ; 

	@FindBy(xpath = "//div[@class=\"buttons\"]//button[@type=\"submit\"]")
	//@FindBy(className = "login-button")
	WebElement loginBtn ;

	
	public void UserLogin(String email , String password) 
	{
		setTextElementText(emailTxtBox, email);
		setTextElementText(passwordTxtBox, password);
		clickButton(loginBtn);
	}
	public void Login(String Email , String Password)
	{
		drvier.findElement(email).sendKeys(Email);
		drvier.findElement(password).sendKeys(Password);
		drvier.findElement(loginButton).click();

	}

}
