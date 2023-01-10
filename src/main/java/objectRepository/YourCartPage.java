package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {
	
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkOutBtn;
	
	public YourCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckOutBtn() {
		return checkOutBtn;
	}
}
