package HybridTestApp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import WebAppAutomation.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce_TC2 extends Base {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	   //This test aims to validate onscreen error messages
		driver.findElement(By.xpath("//android.widget.TextView[@text= 'Argentina']")).click();
		String toastmessage =driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(toastmessage);
		//Verify error message displays
		Assert.assertEquals("Please enter your name", toastmessage);
		
		
	}

}

