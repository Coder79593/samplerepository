package gridtests;

import org.openqa.selenium.WebDriver;

public class WikipediaTest extends BaseTest implements Runnable {
    @Override
    public void run() {
        try {
            WebDriver driver = setupDriver();
            driver.get("https://www.wikipedia.org");
            System.out.println("Wikipedia Title: " + driver.getTitle());
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}