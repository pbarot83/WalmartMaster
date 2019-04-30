package ca.walmart.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ca.walmart.qa.base.TestBase;
import ca.walmart.qa.pages.HomePage;

public class WalmartLogoTest extends TestBase{
	
	HomePage Homepage;
	
	public WalmartLogoTest() {
		
		super();
	}
	
	@BeforeClass
	public void setup() {	
		initialization();
		Homepage = new HomePage();	
	}
	
	@Test(priority=1)
	public void validatelogo() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String logo = Homepage.validatelogo();
		Assert.assertEquals(logo,"Walmart Canada - Save Money. Live Better.");
	}
	
	@Test(priority=2)
	public void EnterText() {
		Homepage.entertext("Bedsheet");
		Homepage.sbuttonclick();
		
	}
	
	@Test(priority=3)
	public void logo() {
		WebElement element = driver.findElement(By.xpath("/html//header[@id='simplified-header']/div[@class='nav-bar zone']/div[@class='row']/div[3]/a[@href='/en']/img[@id='logo']"));
		element.click();
		
	}
	
	@Test(priority=4)
	public void verifysearchoption() {
		String text = Homepage.getsearchtext();
		Assert.assertEquals(text, "What are you looking for?");
		
	}
	
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
