package GridTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.net.URL;
import java.net.MalformedURLException;

public class GridTest {
    public static void main(String[] args) throws MalformedURLException {
        // Hub URL (Update with your Hub's IP if needed)
        String hubURL = "http://10.100.1.188:4444";  // Replace with actual Hub URL

        // Set ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Optional: Run in headless mode

        // Create RemoteWebDriver instance to connect to the hub
        WebDriver driver = new RemoteWebDriver(new URL(hubURL), options);

        // Open a website
        driver.get("https://www.google.com");

        // Print the page title
        System.out.println("Page Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
