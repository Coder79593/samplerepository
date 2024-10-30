package gridtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.net.URL;
import java.net.MalformedURLException;

public class BaseTest {
    protected static WebDriver setupDriver() throws MalformedURLException {
        String hubURL = "http://10.229.53.202:4444/";  // Selenium Grid Hub URL
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Optional: Run in headless mode
        return new RemoteWebDriver(new URL(hubURL), options);
    }
}
