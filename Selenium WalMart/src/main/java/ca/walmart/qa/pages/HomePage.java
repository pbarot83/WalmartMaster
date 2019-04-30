package ca.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ca.walmart.qa.base.TestBase;

public class HomePage extends TestBase {

	//Page Factory - OR:
	
	@FindBy(name="search-form-input")
	WebElement search;
	
	@FindBy(css="#header-mothers-day [href]]")
	WebElement mday;
	
	@FindBy(css=".gicon-magnifier")
	WebElement sbutton;
	
	@FindBy(id="logo-desktop")
	WebElement wlogo;
	
	
	//Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String loginpagevalidation(){
		return driver.getTitle();
		
	}
	
	public String validatelogo() {
		return wlogo.getAttribute("alt");
	}
	
	public void entertext(String text) {
		search.sendKeys(text);
		sbutton.click();
		
	}
	
	public void sbuttonclick() {;
		sbutton.click();
		
	}
	
	public void clicklogo() {
		wlogo.click();
		
	}
	
	public String getsearchtext() {
		return search.getAttribute("title");
		
	}
	
}

