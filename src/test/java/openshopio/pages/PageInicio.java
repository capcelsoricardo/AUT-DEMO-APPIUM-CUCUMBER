package openshopio.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import openshopio.setup.SetUp;
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

	
	//@FindBy(xpath = "//android.widget.ImageView[@resource-id='bf.io.openshop:id/category_image'][@bounds='[0,1462][1440,2178]']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='bf.io.openshop:id/category_image'][@bounds='[0,2104][1440,2392]']")
	public WebElement men;
	
	public void desceScroll() {										
		Helper.swipe(buttonBestSellers, logo);
	}
	
	public void clickMen() {		
		AndroidDriver driver;
		driver = (AndroidDriver) (SetUp.getDriver());
		
		TouchAction tAction = new TouchAction(driver);		 
		tAction.press(730, 2300).release().perform();												
	}

}
