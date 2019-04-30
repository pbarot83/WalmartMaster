package ca.walmart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@FindBy (xpath="//div[@id='shelf-thumbs']/div/article[1]/a[@href='/en/ip/mainstays-super-soft-microfiber-sheet-set-black/6000190147622']//img[@alt='']")
	WebElement addcart1;
	
	@FindBy (xpath="/html//div[@id='product-purchase-cartridge']/div[@class='pricing-shipping']/div[11]/div[@class='row']/div/button[1]")
	WebElement addcart2; 
	
	@FindBy (xpath= "//div[@id='ac-ctas']/a[@href='JavaScript:void(0);']")
	WebElement continueshop;

	@FindBy (xpath="//div[#'ac-ctas']/a[@innertext='Continue shopping']")
	WebElement Continue;
	
	@FindBy (xpath="//a[#'nav-cart']/span[@innertext='1']")
	WebElement Text1;
	
	@FindBy (xpath="/html//a[@id='cart-aside-checkout-btn']")
	WebElement checkout;
	
	
	
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
	
	public void clickaddcart1() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(378,882)", "");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// XXX Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver, 10);
		addcart1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@id='shelf-thumbs']/div/article[1]/div[@class='CTA-container']/button")));
		addcart1.click();

	}

	public void clickaddcart2() {
		try {

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// XXX Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver, 10);
		addcart2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/html//div[@id='product-purchase-cartridge']/div[@class='pricing-shipping']/div[11]/div[@class='row']/div/button[1]")));
		addcart2.click();
	}
	
	public void continueshop() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		continueshop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@id='ac-ctas']/a[@href='https://www.walmart.ca/cart']")));
		continueshop.click();
	}
	
	public String checkout() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		checkout = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html//a[@id='cart-aside-checkout-btn']")));
		return checkout.getAttribute("href");
	}
	
	
}

