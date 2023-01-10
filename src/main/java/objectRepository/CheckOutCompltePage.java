package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutCompltePage {
	

	@FindBy(xpath = "//span[.='Checkout: Complete!']")
	private WebElement checkOutheader;
	

	public CheckOutCompltePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	

	public WebElement getCheckOutheader() {
		return checkOutheader;
	}
}
