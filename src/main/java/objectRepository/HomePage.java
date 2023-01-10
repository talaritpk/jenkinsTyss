package objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement checkOutLookUpImage;
	
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement lhnHideEle;
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	private WebElement logOutBtn;
	
	
	
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	private List<WebElement> productNames;
	
	//button[@id='react-burger-menu-btn']
	//a[@id='logout_sidebar_link']

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	
	
	public List<WebElement> getProductNames() {
		return productNames;
	}




	public WebElement getCheckOutLookUpImage() {
		return checkOutLookUpImage;
	}


	public WebElement getLhnHideEle() {
		return lhnHideEle;
	}


	public WebElement getLogOutBtn() {
		return logOutBtn;
	}
	
	
	
	public void logout()
	{
		lhnHideEle.click();
		logOutBtn.click();
	}
	
	
	
	
	
}
