package saucedemoTests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import genericLibrary.BaseClass;
import objectRepository.CheckOutCompltePage;
import objectRepository.CheckOutOverViewPage;
import objectRepository.CheckOutYourInformationPage;
import objectRepository.HomePage;
import objectRepository.ProductsPage;
import objectRepository.YourCartPage;

public class AddProductTest extends BaseClass{
	
	@Test(groups = "smoke")
	public void addproductTest()
	{
		HomePage hp=new HomePage(driver);
		ProductsPage pPage= new ProductsPage(driver);
		YourCartPage yc=new YourCartPage(driver);
		CheckOutOverViewPage ch=new CheckOutOverViewPage(driver);
		CheckOutCompltePage ccp=new CheckOutCompltePage(driver);
		
		
		
		pPage.getBoltTShirt().click();
		hp.getCheckOutLookUpImage().click();
		yc.getCheckOutBtn().click();
		
		CheckOutYourInformationPage co=new CheckOutYourInformationPage(driver);
		co.enterDetails();
		ch.getFinishBtn().click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ccp.getCheckOutheader());
		
		
		String status=ch.getCheckOutheader().getText();
		
		Assert.assertEquals(status, "CHECKOUT: COMPLETE!");
		
		
	}

}
