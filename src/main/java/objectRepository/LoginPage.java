package objectRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.PropertyFileLibrary;

public class LoginPage {
	
	PropertyFileLibrary pf=new PropertyFileLibrary();
	
	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement uNameTf;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pwdTf;
	
	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getuNameTf() {
		return uNameTf;
	}

	public WebElement getPwdTf() {
		return pwdTf;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	public void Login(String username, String password) throws IOException
	{
		uNameTf.sendKeys(pf.readDataFromPropertyFile(username));
		pwdTf.sendKeys(pf.readDataFromPropertyFile(password));
		loginBtn.click();
	}
	
	
}
