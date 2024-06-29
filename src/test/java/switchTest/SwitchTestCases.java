package switchTest;
import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import switchFitnessApp.SwitchCapabilities;

public class SwitchTestCases extends SwitchCapabilities {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void bt() throws MalformedURLException {
		driver = capabilties();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	
	public void signup() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("Enable Location Services")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(MobileBy.AccessibilityId("SIGN UP")).click();
		driver.findElement(MobileBy.xpath("//*[@text='First Name*']")).sendKeys("satya");
		driver.findElement(MobileBy.xpath("//*[@text='Last Name*']")).sendKeys("singh");
		driver.findElement(MobileBy.xpath("//*[@text='Contact']")).sendKeys("8888888888");
		driver.findElement(MobileBy.xpath("//*[@text='email']")).sendKeys("sunnydoel@gmail.com");
		
		driver.findElement(MobileBy.AccessibilityId("By continuing I confirm that I have read the, , , and,")).click();
		
		driver.findElement(MobileBy.AccessibilityId("Next")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='New Password']")).sendKeys("@Admin123");
		
		driver.findElement(MobileBy.xpath("//*[@text='Confirm New Password']")).sendKeys("@Admin123");
		
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Submit\"))");
	
	
	}
	
	@Test
	
	public void  signin() {
		
		driver.findElement(MobileBy.AccessibilityId("SIGN IN")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Email']")).sendKeys("sunnydoel@gmail.com");
		
		driver.findElement(MobileBy.xpath("//*[@text='Password']")).sendKeys("@Admin123");
		
		driver.findElement(MobileBy.xpath("//*[@text='Remember Me']")).click();
		
		driver.findElement(MobileBy.AccessibilityId("SIGN IN")).click();
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
