package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverViewPage {
	@FindBy(id = "finish")
	private WebElement finishBtn;
	
	@FindBy(xpath = "//span[.='Checkout: Complete!']")
	private WebElement checkOutheader;
	

	public CheckOutOverViewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getFinishBtn() {
		return finishBtn;
	}


	public WebElement getCheckOutheader() {
		return checkOutheader;
	}
	
	


}
