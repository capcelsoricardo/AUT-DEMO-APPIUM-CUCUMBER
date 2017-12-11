package openshopio.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.Helper;

public class PageInicio {
		
	public PageInicio(AppiumDriver<WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
			
	public static PageInicio pageInicio;
	
	@AndroidFindBy(id = "bf.io.openshop:id/skip")
	public WebElement buttonSkip;				 
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Best Sellers']")
	public WebElement buttonBestSellers;
		
	@AndroidFindBy(id = "bf.io.openshop:id/logo")
	public WebElement logo;
	
	public void vaiAte() {										
		Helper.swipe(buttonBestSellers, logo);
	}

}
