package utils;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import openshopio.setup.SetUp;

public class Helper {
		
	public static void back() {			
		SetUp.getDriver().navigate().back();
	}
	
	public static void waitElement(WebElement element, int time_out) {
		WebDriverWait wait = new WebDriverWait(SetUp.getDriver(), time_out); 
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void swipe(WebElement element_a, WebElement element_b) {
		
		AndroidDriver driver;
		driver = (AndroidDriver) (SetUp.getDriver());

		 TouchAction tAction = new TouchAction(driver);		 
		 tAction.longPress(element_a).moveTo(element_b).release().perform();
	}                                                                 
    

}
