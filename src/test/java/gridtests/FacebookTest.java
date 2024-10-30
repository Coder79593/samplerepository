package gridtests;

import org.openqa.selenium.WebDriver;

public class FacebookTest extends BaseTest implements Runnable {
    @Override
    public void run() {
        try {
            WebDriver driver = setupDriver();
            driver.get("https://www.facebook.com");
            System.out.println("Facebook Title: " + driver.getTitle());
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}