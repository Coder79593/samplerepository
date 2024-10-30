package gridtests;

import org.openqa.selenium.WebDriver;

public class AmazonTest extends BaseTest implements Runnable {
    @Override
    public void run() {
        try {
            WebDriver driver = setupDriver();
            driver.get("https://www.amazon.com");
            System.out.println("Amazon Title: " + driver.getTitle());
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}