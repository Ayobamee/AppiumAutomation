package WebAppAutomation;

//import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class WebAppBaseChrome {

//	@SuppressWarnings("deprecation")
	public static  AndroidDriver<AndroidElement> Capabilities () throws MalformedURLException{
	AndroidDriver<AndroidElement> driver;
		
		/*File f =new File("src");
		File fs =new File(f, "ApiDemos-debug (3).apk");*/ 
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TECNO Camnon CX API 25");
		cap.setCapability(MobileCapabilityType.VERSION, "9.0");
		//cap.setCapability(CapabilityType.PLATFORM, MobilePlatform.ANDROID);
		//cap.setCapability(CapabilityType.PLATFORM,MobilePlatform.ANDROID);
		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		//cap.setCapability("chromedriverExecutable", "/Users/Ayobami/node_modules/chromedriver/bin/chromedriver");
		cap.setCapability("chromedriverExecutable", "C:\\Users\\Ayobami\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe");
		//cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
	   cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
       driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap );
       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
       
       return driver;
           
       
	}
	

} 
