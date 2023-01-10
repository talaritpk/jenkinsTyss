package genericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePage;
import objectRepository.LoginPage;

public class BaseClass {
	public WebDriver driver;
	PropertyFileLibrary pfl=new PropertyFileLibrary();
	
	@BeforeSuite(groups ={"smoke","regression"})
	public void bsConfig() {
		System.out.println("Database Connected Successfully");
	}
	@BeforeClass(groups ={"smoke","regression"})
	public void bcConfig() throws IOException {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(pfl.readDataFromPropertyFile("url"));
		}
	
	
	@BeforeMethod(groups ={"smoke","regression"})
	public void bmConfig() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.Login("username", "password");
//		driver.switchTo().alert().accept();
		
	}
	
	@AfterMethod(groups ={"smoke","regression"})
	public void baConfig()
	{
		HomePage hp=new HomePage(driver);
		hp.logout();
	}
	
	@AfterClass(groups ={"smoke","regression"})
	public void acConfig()
	{
		driver.close();
	}
		
		
	}


