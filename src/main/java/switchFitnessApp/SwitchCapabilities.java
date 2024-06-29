package switchFitnessApp;
import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwitchCapabilities {
public static AndroidDriver<AndroidElement>capabilties() throws MalformedURLException {


		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"SatyaSingh");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.dcs.provider");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.dcs.provider.MainActivity");
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		return driver;
		
	}
	

}
