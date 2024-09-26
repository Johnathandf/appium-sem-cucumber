package org.example.qazandodozero2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import java.net.MalformedURLException;
import java.net.URL;

public class DeviceFarmLogin {

    private static ScreenLogin ScreenLogin;
    private static AppiumDriver<RemoteWebElement> driver;

    @BeforeClass
    public static void caps() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "johntest_Ksgqeu");
        caps.setCapability("browserstack.key", "9HQmxXwULmsxsUXvx2WL");

        // Set URL of the application under test
        caps.setCapability("app", "bs://517517dbfe21288fdffa4197f06972536623b6f9");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 7 Pro");
        caps.setCapability("os_version", "13.0");

        driver = new AndroidDriver<RemoteWebElement>(new URL("http://hub.browserstack.com/wd/hub"), caps);
        ScreenLogin = new ScreenLogin(driver);
    }

    @Test
    public void testeLogin() {
        ScreenLogin.logar();
    }
}