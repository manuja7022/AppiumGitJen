package testScripts;

import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
public class Test001 
{
	@Test
	public void test() throws Exception
	{
		// String userName = "manug_EgH7LT";
        //String accessKey = "xwfrmTX9arqMxFtaiptB";
	
   // options.setApp("bs://c0a1f39d24c7bc0a521660839dc4c9166d12b141");

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserstack.user", "manug_EgH7LT");
		caps.setCapability("browserstack.key", "xwfrmTX9arqMxFtaiptB");
		caps.setCapability("app", "bs://c0a1f39d24c7bc0a521660839dc4c9166d12b141"); // If using a mobile app uploaded to BrowserStack
		caps.setCapability("device", "Google Pixel 8");
		caps.setCapability("os_version", "12.0");
		caps.setCapability("project", "Appium Jenkins Integration");
		caps.setCapability("build", "Build 1");
		caps.setCapability("name", "Appium Test");

		AndroidDriver driver = new AndroidDriver(
				new URL("http://hub.browserstack.com/wd/hub"), caps);

		// Your test code here

		driver.quit();


	}

}
