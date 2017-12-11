package openshopio.steps;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import static openshopio.setup.SetUp.setUp;

import java.net.MalformedURLException;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(		
		features = {"src/test/java/openshopio/features/CompraProduto.feature"},
		plugin = {"json:target/cucumber_json/cucumber.json"}
		)

public class CucumberRunner {
	
	@BeforeClass
	public static void setUpAppium () throws MalformedURLException{
		setUp();				
	}
	

}
