package ca.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ca.walmart.qa.base.TestBase;

public class HomePage extends TestBase {

	//Page Factory - OR:
	
	@FindBy(name="search-form-input")
	WebElement search;
	
	@FindBy(id="header-mothers-day")
	WebElement mday;
	
	@FindBy(css =".html-cartridge.mobile-hide")
	WebElement texttoconfirm;
	
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
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
	
	public void clickmday() {
		mday.click();

	}
	
	public String returntheheading() {
		return texttoconfirm.getText();
		
	}
	
	
}

