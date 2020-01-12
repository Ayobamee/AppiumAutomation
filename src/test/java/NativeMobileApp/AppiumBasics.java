package NativeMobileApp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


//this class explains find elements with xpath,id,classname etc
public class AppiumBasics extends NativeAppBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement>driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Notes
		/*xpath formula = //tagname[@attribute = 'value']
		//text is a unit attribute in identifying xpath for mobile devcies
		stop appium server before inspecting using UI Automator
		*/
		
		//Navigating to choose wifi settings on Native app
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text= '3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox"));
        driver.findElement(By.xpath("(//android.widget.RelativeLayout[2])")).click();
        driver.findElement(By.className("android.widget.EditText")).sendKeys("Test Wifi");
        driver.findElement(By.id("android:id/button1")).click();
        
	}   

}
