package ca.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ca.walmart.qa.base.TestBase;

public class AddCart extends TestBase{
	
	@FindBy (xpath="//article[1]//span[@innertext='Add to cart']")
	WebElement addcart1;

	@FindBy (xpath="//div[#'ac-ctas']/a[@innertext='Continue shopping']")
	WebElement Continue;
	
	@FindBy (xpath="//a[#'nav-cart']/span[@innertext='1']")
	WebElement Text1;
	
	//Initializing the Page Objects:
	public AddCart() {
		PageFactory.initElements(driver, this);
	}
	

}

