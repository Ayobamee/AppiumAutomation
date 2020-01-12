package WebAppAutomation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FacebookLogin extends WebAppBaseChrome {

	public static void main(String[] args) throws MalformedURLException {
	
	AndroidDriver<AndroidElement> driver = Capabilities();
	driver.get("http://facebook.com");
	driver.findElement(By.xpath("//*[@id=\"m_login_email\"]")).sendKeys("ayobami.com");
	driver.findElement(By.xpath("//*[@id=\"m_login_password\"]")).sendKeys("ayo11123");
	driver.findElement(By.xpath("//button[@value='Log In']")).click();

	}

}
