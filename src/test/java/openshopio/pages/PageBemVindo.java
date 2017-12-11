package openshopio.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.Helper;

public class PageBemVindo {
		
	public PageBemVindo(AppiumDriver<WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}				
	
	public static PageBemVindo pageBemVindo;	
	
	@AndroidFindBy(id = "bf.io.openshop:id/skip")
	public WebElement buttonSkip;
	
	public void clickButtonSkip() {
		Helper.waitElement(buttonSkip, 20);
		buttonSkip.click();					
	}
}
