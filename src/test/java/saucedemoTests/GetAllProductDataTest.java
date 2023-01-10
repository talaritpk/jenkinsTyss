package saucedemoTests;

import java.util.List;

import org.apache.poi.hpsf.HPSFException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import objectRepository.HomePage;

public class GetAllProductDataTest extends BaseClass {
	@Test(groups = "regression")
	public void getAllDataTest()
	{
		
		
//		String data=driver.findElement(By.xpath("//div[@class='inventory_list']")).getText();
//		Reporter.log(data,true);
//		
//		WebElement =driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
//		Reporter.log(dataElements,true);
		
		System.out.println("************The All Products Names Are **************");
//		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		
		HomePage hp=new HomePage(driver);
		List<WebElement> w = hp.getProductNames();
		for(WebElement ele1:w)
		{
			Reporter.log(ele1.getText(),true);
		}
	}

}
