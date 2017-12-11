package openshopio.setup;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class SetUp {

	public static AppiumDriver<WebElement> driver;			
	
	@BeforeClass
	public static void setUp() throws MalformedURLException {
		
		File arquivoCompleto = new File("src/main/java/Openshop_io_2_0_v1.8.3.apk");				
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);				
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability("appPackage", "bf.io.openshop");		
		cap.setCapability("appActivity", "com.asymbo.activity.HomepageActivity_");	
		//cap.setCapability("noReset", true);
		cap.setCapability(MobileCapabilityType.APP, arquivoCompleto.getAbsolutePath());		
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);		
	}		
	
	public static AppiumDriver<WebElement> getDriver() {
		return driver;
	}
}