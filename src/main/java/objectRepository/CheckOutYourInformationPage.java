package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;

public class CheckOutYourInformationPage {
	
	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement firstNameTf;
	

	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement lastNameTf;
	
	
	@FindBy(xpath = "//input[@id='postal-code']")
	private WebElement postalTf;
	
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueBtn;
	
	@FindBy(xpath = "//button[@id='finish']")
	private WebElement FinishBtn;
	
	
	@FindBy(xpath = "//span[@class='title']")
	private WebElement checkOutcomplte;
	
	
	
	public CheckOutYourInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTf() {
		return firstNameTf;
	}

	public WebElement getLastNameTf() {
		return lastNameTf;
	}

	public WebElement getPostalTf() {
		return postalTf;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getCheckOutcomplte() {
		return checkOutcomplte;
	}

	public void enterDetails()
	{
		Faker faker=new Faker();
		
		firstNameTf.sendKeys(faker.name().firstName());
		lastNameTf.sendKeys(faker.name().lastName());
		postalTf.sendKeys(faker.number().digits(6));
		continueBtn.click();
	}
	
	

	
}
