package ca.walmart.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ca.walmart.qa.base.TestBase;
import ca.walmart.qa.pages.AddCart;
import ca.walmart.qa.pages.HomePage;
import junit.framework.Assert;

public class MDay extends TestBase{
	HomePage Homepage;
	AddCart Addcart;
	
	@BeforeClass
	public void setup() {	
		initialization();
		Homepage = new HomePage();	
	}
	
	@Test(priority=1)
	public void mdaylink() {
		Homepage.clickmday();
	}
	
	@Test(priority=2)
	public void AssertMDay() {
		String st1 = Homepage.returntheheading();
		Assert.assertEquals(st1,"Mother's Day 2019");
	}
	
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
