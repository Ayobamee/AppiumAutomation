package NativeMobileApp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//this class explains find elements with UIAutomator
public class UIAutomator extends NativeAppBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement>driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Identifying element using driver.findElementByAndroidUIAutomator("attribute("value")")
		driver.findElementByAndroidUIAutomator("text(\"Views\")");
		
		//Validating clickable feature for all options
		//driver.findElementsByAndroidUIAutomator("newUISelector().property(value)");
		
	System.out.println(driver.findElementsByAndroidUIAutomator("newUISelector().clickable(true)").size());
		
	}

}
